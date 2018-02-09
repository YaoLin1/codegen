package com.witown.deals.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.witown.deals.dao.TestCaseBase;
import com.witown.deals.domain.Coupon;
import com.witown.deals.service.CouponService;
/**
 * 类CouponServiceTest.java的实现描述：CouponService单元测试
 * @author  JianLin.Zhu 2018-02-09 15:01:57
 */
public class CouponServiceTest extends TestCaseBase {
    
    @Autowired
    private CouponService couponService;
    
    @Test
    public void load(){
        Coupon bean = couponService.load(1L);
        logger.debug("Coupon="+bean);
        Assert.assertTrue(bean!=null && bean.getAutoId() ==1L);
    } 
    
}