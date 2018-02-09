/*
 * RegionServiceImpl.java  Created On 2018-02-09
 * Copyright(c) 2015 Treebear Inc.
 * ALL Rights Reserved.
 */
package com.witown.deals.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.witown.deals.dao.GenericDao;
import com.witown.deals.dao.RegionDao;
import com.witown.deals.domain.Region;
import com.witown.deals.service.RegionService;
/**
 * 类RegionServiceImpl的实现描述：wd_region-行政地域表
 * @author JianLin.Zhu 2018-02-09 15:01:57
 */
@Service
public class RegionServiceImpl extends GenericServiceImpl<Long, Region> implements RegionService  {
    @Autowired
    private RegionDao      regionDao;

    @Override
    public GenericDao<Long, Region> getGenericDao() {
        return regionDao;
    }
    
}