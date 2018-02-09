/*
 * ${tableModel.domainName}ServiceImpl.java  Created On ${tableModel.currentDate}
 * Copyright(c) 2015 Treebear Inc.
 * ALL Rights Reserved.
 */
package com.witown.deals.service.impl;

import org.springframework.stereotype.Service;

{tableModel.domainName}Dao;
        {tableModel.domainName};
        {tableModel.domainName}Service;
/**
 * 类${tableModel.domainName}ServiceImpl的实现描述：${tableModel.tableChineseName}
 * @author ${author} ${tableModel.currentDate} ${tableModel.currentTime}
 */
@Service
public class ${tableModel.domainName}ServiceImpl extends GenericServiceImpl<Long, ${tableModel.domainName}> implements ${tableModel.domainName}Service  {
    @Autowired
    private ${tableModel.domainName}Dao      ${tableModel.domainNameWithFirstCaseLower}Dao;

    @Override
    public GenericDao<Long, ${tableModel.domainName}> getGenericDao() {
        return ${tableModel.domainNameWithFirstCaseLower}Dao;
    }
    
}