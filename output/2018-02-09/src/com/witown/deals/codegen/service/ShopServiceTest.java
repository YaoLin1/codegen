package com.witown.deals.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.witown.deals.dao.TestCaseBase;
import com.witown.deals.domain.Shop;
import com.witown.deals.service.ShopService;
/**
 * 类ShopServiceTest.java的实现描述：ShopService单元测试
 * @author  JianLin.Zhu 2018-02-09 15:01:57
 */
public class ShopServiceTest extends TestCaseBase {
    
    @Autowired
    private ShopService shopService;
    
    @Test
    public void load(){
        Shop bean = shopService.load(1L);
        logger.debug("Shop="+bean);
        Assert.assertTrue(bean!=null && bean.getAutoId() ==1L);
    } 
    
}