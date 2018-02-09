/*
 * InsideMessageServiceImpl.java  Created On 2018-02-09
 * Copyright(c) 2015 Treebear Inc.
 * ALL Rights Reserved.
 */
package com.witown.deals.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.witown.deals.dao.GenericDao;
import com.witown.deals.dao.InsideMessageDao;
import com.witown.deals.domain.InsideMessage;
import com.witown.deals.service.InsideMessageService;
/**
 * 类InsideMessageServiceImpl的实现描述：wd_inside_message-站内信
 * @author JianLin.Zhu 2018-02-09 15:01:57
 */
@Service
public class InsideMessageServiceImpl extends GenericServiceImpl<Long, InsideMessage> implements InsideMessageService  {
    @Autowired
    private InsideMessageDao      insideMessageDao;

    @Override
    public GenericDao<Long, InsideMessage> getGenericDao() {
        return insideMessageDao;
    }
    
}