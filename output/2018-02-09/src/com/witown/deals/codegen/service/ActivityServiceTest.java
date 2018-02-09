package com.witown.deals.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.witown.deals.dao.TestCaseBase;
import com.witown.deals.domain.Activity;
import com.witown.deals.service.ActivityService;
/**
 * 类ActivityServiceTest.java的实现描述：ActivityService单元测试
 * @author  JianLin.Zhu 2018-02-09 15:01:57
 */
public class ActivityServiceTest extends TestCaseBase {
    
    @Autowired
    private ActivityService activityService;
    
    @Test
    public void load(){
        Activity bean = activityService.load(1L);
        logger.debug("Activity="+bean);
        Assert.assertTrue(bean!=null && bean.getAutoId() ==1L);
    } 
    
}