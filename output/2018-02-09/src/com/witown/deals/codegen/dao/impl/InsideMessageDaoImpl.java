/*
 * InsideMessageDaoImpl.java  Created On 2018-02-09
 * Copyright(c) 2015 Treebear Inc.
 * ALL Rights Reserved.
 */
package com.witown.deals.dao.impl;

import org.springframework.stereotype.Repository;

import com.witown.deals.dao.InsideMessageDao;
import com.witown.deals.domain.InsideMessage;
/**
 * 类InsideMessageDaoImpl的实现描述：wd_inside_message-站内信
 * @author JianLin.Zhu 2018-02-09 15:01:57
 */
@Repository
public class InsideMessageDaoImpl extends GenericDaoImpl<Long, InsideMessage> implements InsideMessageDao  {
    @Override
    protected String getNamespace() {
        return "INSIDEMESSAGE";
    }


}