package com.witown.deals.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.witown.deals.dao.TestCaseBase;
import com.witown.deals.domain.Region;
import com.witown.deals.service.RegionService;
/**
 * 类RegionServiceTest.java的实现描述：RegionService单元测试
 * @author  JianLin.Zhu 2018-02-09 15:01:57
 */
public class RegionServiceTest extends TestCaseBase {
    
    @Autowired
    private RegionService regionService;
    
    @Test
    public void load(){
        Region bean = regionService.load(1L);
        logger.debug("Region="+bean);
        Assert.assertTrue(bean!=null && bean.getAutoId() ==1L);
    } 
    
}