package org.cliff.codegen;


import org.cliff.codegen.model.ColumnModel;
import org.cliff.codegen.model.DataBaseModel;
import org.cliff.codegen.model.TableModel;
import org.cliff.codegen.model.TemplateInfo;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类CodeGenMain.java的实现描述：代码生成入口
 * 
 * @author JianLin.Zhu 2015-7-27 下午4:40:53
 */
public class CodeGenMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            InputStream in = CodeGenMain.class.getClassLoader().getResourceAsStream("codegen.properties");
            Properties p = new Properties();
            p.load(in);
            in.close();
            
            String outputdir = p.getProperty("outputdir","./output/");// 输出目录,可修改,比如改为D:/output
            
            DataBaseModel dataBaseModel = loadDataBaseModel(p);
            String templateSourceDir = "./template/";// 模板根目录，不建议修改
            List<TemplateInfo> list = TemplateConfig.ReadConfigXml("./template/template.xml");// 读取模版配置文件
            for (int i = 0; i < list.size(); i++) {
                TemplateInfo templateInfo = (TemplateInfo) list.get(i);
                System.out.println("start deal template:" + templateInfo.getTemplateName());
                Generator.generateTableContext(dataBaseModel, templateInfo, outputdir, templateSourceDir);// 进行表模版生成
                System.out.println("finish " + templateInfo.getTemplateName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 加载数据库schema
     */
    private static DataBaseModel loadDataBaseModel(Properties p) throws Exception {
        DataBaseModel dataBaseModel = new ReadMysql().genarateMysqlDataBase(p);
        return dataBaseModel;
    }

    public static class ReadMysql {

        public DataBaseModel genarateMysqlDataBase(Properties p) {
            //--------------生成代码前修改如下配置start----------------------------//
            String host = p.getProperty("host");
            String database = p.getProperty("database");
            String user = p.getProperty("user");
            String pass = p.getProperty("pass");
            String packname = p.getProperty("packname");// bean所属组,默认用空字符串即可
            String tableNamePrefix = p.getProperty("tableNamePrefix");// 设置表名前缀
            String tablename = p.getProperty("tablename");// 多个用逗号分隔即可
            String author = p.getProperty("author","JianLin.Zhu");
            //--------------生成代码前修改如下配置 end----------------------------//
            
            DataBaseModel db = new DataBaseModel();
            db.setDataBaseName(database);
            db.setAuthor(author);// 设置签名
            Connection conn = null;
            try {
                List<TableModel> tableModelList = new ArrayList<TableModel>();
                conn = DBManager.mysql(host, database, user, pass);
                if (tablename.length() > 0) {
                    tableModelList.addAll(parseBatchTable(conn, packname, tablename.split(","), tableNamePrefix));
                } else {
                    tableModelList.addAll(parseAllTable(conn, packname, tableNamePrefix));
                }
                db.setTableModelList(tableModelList);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                // setTips("找不到MySQL的jar包");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return db;
        }

        /**
         * 开始处理生成所有表 如果不传入表名，表示将数据库中所有表生成bean; 可以指定表名生成bean;
         */
        public List<TableModel> parseAllTable(Connection conn, String packname, String tableNamePrefix) {
            List<TableModel> result = new ArrayList<TableModel>();
            String sql = "show tables";
            ResultSet rs = DBManager.query(conn, sql);
            try {
                while (rs.next()) {
                    String tablename = rs.getString(1);
                    result.add(parseTableByShowCreate(conn, tablename, packname, tableNamePrefix));
                }
                DBManager.close(conn, null, rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return result;
        }

        /**
         * 开始处理生成所有表 如果不传入表名，表示将数据库中所有表生成bean; 可以指定表名生成bean;
         */
        public List<TableModel> parseBatchTable(Connection conn, String packname, String[] tables, String tableNamePrefix) {
            List<TableModel> result = new ArrayList<TableModel>();
            for (String tablename : tables) {
                result.add(parseTableByShowCreate(conn, tablename, tableNamePrefix, packname));
            }
            return result;
        }

        /**
         * 通过 mysql的 show create table TABLE_NAME逆向生成Bean;
         * 
         * @param conn
         * @param tname
         * @param outputdir
         * @param packname
         */
        private TableModel parseTableByShowCreate(Connection conn, String tablename, String tableNamePrefix, String packname) {
            TableModel table = new TableModel();
            table.setTableName(tablename);
            table.setModuleName(packname);
            table.setTableNamePrefix(tableNamePrefix);
            List<ColumnModel> columnList = new ArrayList<ColumnModel>();
            table.setColumnList(columnList);
            boolean shouldCloseConn = false;
            String sql = "show create table " + tablename;
            ResultSet rs = null;

            try {
                rs = DBManager.query(conn, sql);
                while (rs.next()) {

                    String sqlstr = rs.getString(2);
                    String lines[] = sqlstr.split("\r\n");
                    for (int i = 0; i < lines.length; i++) {
                        String line = lines[i];
                        String regex = "\\s*`([^`]*)`\\s*(\\w+[^ ]*)\\s*(NOT\\s+NULL\\s*)?(DEFAULT\\s*([^ ]*|NULL|'0'|''|CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP)\\s*)?(\\s*AUTO_INCREMENT\\s*)?(COMMENT\\s*'([^']*)')?\\s*,\\s*";
                        Pattern p = Pattern.compile(regex);
                        Matcher m = p.matcher(line);
                        while (m.find()) {
                            try {
                                String field = m.group(1);
                                String type = typeTrans(m.group(2));
                                if (type == null) {
                                    System.out.println("unknow type=" + m.group(2));
                                    continue;
                                }
                                String cmt = m.group(8);

                                // convert to column
                                ColumnModel column = new ColumnModel();
                                column.setColumnName(field);
                                column.setColumnType(type);
                                column.setColumnChineseName(cmt == null ? "" : cmt);
                                column.setRemark(cmt);
                                if ("autoId".equalsIgnoreCase(column.getColumnName()) || "id".equalsIgnoreCase(column.getColumnName())) {
                                    column.setIsPK(true);
                                }
                                columnList.add(column);
                            } catch (Exception e) {
                                e.printStackTrace();
                                // ignore
                            }
                        }
                        if (i == lines.length - 1) {
                            String comment = "";
                            int index = line.indexOf("COMMENT=");
                            if (index != -1) {
                                String tmp = line.substring(index + 8);
                                comment = tmp.replace("'", "");
                            }
                            table.setTableChineseName(comment);
                        }

                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                DBManager.close(shouldCloseConn ? conn : null, null, rs);
            }
            return table;
        }

        /**
         * mysql的类型转换到java 类型参考文章 http://hi.baidu.com/wwtvanessa/blog/item/9fe555945a07bd16d31b70cd.html
         */
        public String typeTrans(String type) {
            if (type.contains("tinyint")) {
                return "boolean";
            } else if (type.startsWith("int")) {
                return "Integer";
            } else if (type.contains("bigint")) {
                return "Long";
            } else if (type.contains("date") || type.contains("time") || type.contains("datetime") || type.contains("timestamp")) {
                return "Date";
            } else if (type.contains("varchar") || type.contains("text") || type.startsWith("char") || type.contains("enum") || type.contains("set")) {
                return "String";
            } else if (type.contains("binary") || type.contains("blob")) {
                return "byte[]";
            } else if (type.contains("decimal")) {
                return "Double";
            } else {
                return null;
            }
        }

        public String upperFirestChar(String src) {
            return src.substring(0, 1).toUpperCase().concat(src.substring(1));
        }
    }

}
