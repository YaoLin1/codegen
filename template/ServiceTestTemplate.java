package com.witown.deals.service;

{tableModel.domainName};
        {tableModel.domainName}Service;
/**
 * 类${tableModel.domainName}ServiceTest.java的实现描述：${tableModel.domainName}Service单元测试
 * @author  ${author} ${tableModel.currentDate} ${tableModel.currentTime}
 */
public class ${tableModel.domainName}ServiceTest extends TestCaseBase {
    
    @Autowired
    private ${tableModel.domainName}Service ${tableModel.domainNameWithFirstCaseLower}Service;
    
    @Test
    public void load(){
        ${tableModel.domainName} bean = ${tableModel.domainNameWithFirstCaseLower}Service.load(1L);
        logger.debug("${tableModel.domainName}="+bean);
        Assert.assertTrue(bean!=null && bean.getAutoId() ==1L);
    } 
    
}