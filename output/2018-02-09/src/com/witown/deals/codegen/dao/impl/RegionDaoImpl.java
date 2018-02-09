/*
 * RegionDaoImpl.java  Created On 2018-02-09
 * Copyright(c) 2015 Treebear Inc.
 * ALL Rights Reserved.
 */
package com.witown.deals.dao.impl;

import org.springframework.stereotype.Repository;

import com.witown.deals.dao.RegionDao;
import com.witown.deals.domain.Region;
/**
 * 类RegionDaoImpl的实现描述：wd_region-行政地域表
 * @author JianLin.Zhu 2018-02-09 15:01:57
 */
@Repository
public class RegionDaoImpl extends GenericDaoImpl<Long, Region> implements RegionDao  {
    @Override
    protected String getNamespace() {
        return "REGION";
    }


}