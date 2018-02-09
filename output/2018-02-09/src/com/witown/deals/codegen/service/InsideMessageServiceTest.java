package com.witown.deals.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.witown.deals.dao.TestCaseBase;
import com.witown.deals.domain.InsideMessage;
import com.witown.deals.service.InsideMessageService;
/**
 * 类InsideMessageServiceTest.java的实现描述：InsideMessageService单元测试
 * @author  JianLin.Zhu 2018-02-09 15:01:57
 */
public class InsideMessageServiceTest extends TestCaseBase {
    
    @Autowired
    private InsideMessageService insideMessageService;
    
    @Test
    public void load(){
        InsideMessage bean = insideMessageService.load(1L);
        logger.debug("InsideMessage="+bean);
        Assert.assertTrue(bean!=null && bean.getAutoId() ==1L);
    } 
    
}