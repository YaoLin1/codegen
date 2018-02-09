/*
 * ActivityServiceImpl.java  Created On 2018-02-09
 * Copyright(c) 2015 Treebear Inc.
 * ALL Rights Reserved.
 */
package com.witown.deals.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.witown.deals.dao.GenericDao;
import com.witown.deals.dao.ActivityDao;
import com.witown.deals.domain.Activity;
import com.witown.deals.service.ActivityService;
/**
 * 类ActivityServiceImpl的实现描述：wd_activity-活动表
 * @author JianLin.Zhu 2018-02-09 15:01:57
 */
@Service
public class ActivityServiceImpl extends GenericServiceImpl<Long, Activity> implements ActivityService  {
    @Autowired
    private ActivityDao      activityDao;

    @Override
    public GenericDao<Long, Activity> getGenericDao() {
        return activityDao;
    }
    
}