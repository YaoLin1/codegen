# codegen
一款自定义模版（freemarker）的代码生成工具

# 快速入门

## clone代码

````
git clone git@github.com:YaoLin1/codegen.git
````

## 编译

在codegen目录下执行编译命令

````
mvn clean package -DskipTests=true
````

## 修改jdbc配置，目前仅支持mysql

````
修改配置文件 /codegen/src/main/resources/codegen.properties

内容

outputdir=./output/   #输出目录，必填

host=localhost        #mysqlhost，必填

database=o2o_deals    #数据库名，必填

user=o2o              #数据库账户名，必填

pass=123456           #密码，必填

packname=             #应用包名，可不填

tableNamePrefix=wd_   #表前缀，可不填

tablename=wd_region,wd_account,wd_activity,wd_coupon,wd_inside_message,wd_shop,wd_ticket #待生成表名列表，以逗号分割

author=JianLin.Zhu    #作者名，可不填

````
## 运行codegen/CodeGenMain.java 

日志


>finish SqlMapTemplate.xml
start deal template:DomainTemplate.java
finish DomainTemplate.java
start deal template:DaoTemplate.java
finish DaoTemplate.java
start deal template:DaoImplTemplate.java
finish DaoImplTemplate.java
start deal template:ServiceTemplate.java
finish ServiceTemplate.java
start deal template:ServiceImplTemplate.java
finish ServiceImplTemplate.java
start deal template:ServiceTestTemplate.java
finish ServiceTestTemplate.java

>Process finished with exit code 0

## 查看生成文件
默认在codegen/output目录下文件，多次生成会覆盖原有代码
