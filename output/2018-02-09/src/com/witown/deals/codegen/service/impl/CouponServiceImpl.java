/*
 * CouponServiceImpl.java  Created On 2018-02-09
 * Copyright(c) 2015 Treebear Inc.
 * ALL Rights Reserved.
 */
package com.witown.deals.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.witown.deals.dao.GenericDao;
import com.witown.deals.dao.CouponDao;
import com.witown.deals.domain.Coupon;
import com.witown.deals.service.CouponService;
/**
 * 类CouponServiceImpl的实现描述：wd_coupon-有卖优惠券表
 * @author JianLin.Zhu 2018-02-09 15:01:57
 */
@Service
public class CouponServiceImpl extends GenericServiceImpl<Long, Coupon> implements CouponService  {
    @Autowired
    private CouponDao      couponDao;

    @Override
    public GenericDao<Long, Coupon> getGenericDao() {
        return couponDao;
    }
    
}