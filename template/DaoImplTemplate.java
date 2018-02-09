/*
 * ${tableModel.domainName}DaoImpl.java  Created On ${tableModel.currentDate}
 * Copyright(c) 2015 Treebear Inc.
 * ALL Rights Reserved.
 */
package com.witown.deals.dao.impl;

import org.springframework.stereotype.Repository;

import com.witown.deals.dao.${tableModel.domainName}Dao;
import com.witown.deals.domain.${tableModel.domainName};
/**
 * 类${tableModel.domainName}DaoImpl的实现描述：${tableModel.tableChineseName}
 * @author ${author} ${tableModel.currentDate} ${tableModel.currentTime}
 */
@Repository
public class ${tableModel.domainName}DaoImpl extends GenericDaoImpl<Long, ${tableModel.domainName}> implements ${tableModel.domainName}Dao  {
    @Override
    protected String getNamespace() {
        return "${tableModel.sqlMapNamespace}";
    }


}