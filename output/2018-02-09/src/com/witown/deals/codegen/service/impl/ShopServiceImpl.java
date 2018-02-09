/*
 * ShopServiceImpl.java  Created On 2018-02-09
 * Copyright(c) 2015 Treebear Inc.
 * ALL Rights Reserved.
 */
package com.witown.deals.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.witown.deals.dao.GenericDao;
import com.witown.deals.dao.ShopDao;
import com.witown.deals.domain.Shop;
import com.witown.deals.service.ShopService;
/**
 * 类ShopServiceImpl的实现描述：wd_shop-有卖商家表
 * @author JianLin.Zhu 2018-02-09 15:01:57
 */
@Service
public class ShopServiceImpl extends GenericServiceImpl<Long, Shop> implements ShopService  {
    @Autowired
    private ShopDao      shopDao;

    @Override
    public GenericDao<Long, Shop> getGenericDao() {
        return shopDao;
    }
    
}