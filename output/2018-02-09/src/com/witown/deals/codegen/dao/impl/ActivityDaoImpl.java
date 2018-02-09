/*
 * ActivityDaoImpl.java  Created On 2018-02-09
 * Copyright(c) 2015 Treebear Inc.
 * ALL Rights Reserved.
 */
package com.witown.deals.dao.impl;

import org.springframework.stereotype.Repository;

import com.witown.deals.dao.ActivityDao;
import com.witown.deals.domain.Activity;
/**
 * 类ActivityDaoImpl的实现描述：wd_activity-活动表
 * @author JianLin.Zhu 2018-02-09 15:01:57
 */
@Repository
public class ActivityDaoImpl extends GenericDaoImpl<Long, Activity> implements ActivityDao  {
    @Override
    protected String getNamespace() {
        return "ACTIVITY";
    }


}