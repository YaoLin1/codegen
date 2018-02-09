/*
 * ${tableModel.tableName2Pascal}.java 
 * Copyright(c) 2015 Treebear
 * ALL Rights Reserved.
 */
package com.witown.deals.domain;

/**
 * 类${tableModel.domainName}的实现描述：${tableModel.tableChineseName}
 * 
 * @author ${author} 2015-07-27 19:36:00
 */
public class ${tableModel.domainName} implements Serializable{
    <#list tableModel.columnList as columnModel>
    
    private ${columnModel.columnType} ${columnModel.columnName};     // ${columnModel.columnChineseName}
    
    </#list>
    <#list tableModel.columnList as columnModel>
    public void set${columnModel.columnNameFirstUpper}(${columnModel.columnType} ${columnModel.columnName}) {
        this.${columnModel.columnName} = ${columnModel.columnName};
    }
    
    public ${columnModel.columnType} get${columnModel.columnNameFirstUpper}() {
        return this.${columnModel.columnName};
    }
    </#list>
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}