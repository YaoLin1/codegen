/*
 * ShopDaoImpl.java  Created On 2018-02-09
 * Copyright(c) 2015 Treebear Inc.
 * ALL Rights Reserved.
 */
package com.witown.deals.dao.impl;

import org.springframework.stereotype.Repository;

import com.witown.deals.dao.ShopDao;
import com.witown.deals.domain.Shop;
/**
 * 类ShopDaoImpl的实现描述：wd_shop-有卖商家表
 * @author JianLin.Zhu 2018-02-09 15:01:57
 */
@Repository
public class ShopDaoImpl extends GenericDaoImpl<Long, Shop> implements ShopDao  {
    @Override
    protected String getNamespace() {
        return "SHOP";
    }


}