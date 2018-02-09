/*
 * CouponDaoImpl.java  Created On 2018-02-09
 * Copyright(c) 2015 Treebear Inc.
 * ALL Rights Reserved.
 */
package com.witown.deals.dao.impl;

import org.springframework.stereotype.Repository;

import com.witown.deals.dao.CouponDao;
import com.witown.deals.domain.Coupon;
/**
 * 类CouponDaoImpl的实现描述：wd_coupon-有卖优惠券表
 * @author JianLin.Zhu 2018-02-09 15:01:57
 */
@Repository
public class CouponDaoImpl extends GenericDaoImpl<Long, Coupon> implements CouponDao  {
    @Override
    protected String getNamespace() {
        return "COUPON";
    }


}