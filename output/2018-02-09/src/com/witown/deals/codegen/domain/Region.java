/*
 * Region.java 
 * Copyright(c) 2015 Treebear
 * ALL Rights Reserved.
 */
package com.witown.deals.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;
/**
 * 类Region的实现描述：wd_region-行政地域表
 * 
 * @author JianLin.Zhu 2015-07-27 19:36:00
 */
public class Region implements Serializable{
    
    private String regionId;     // 地域ID，非0开头的数字
    
    
    private String regionName;     // 地域名称
    
    
    private String pid;     // 父级地域ID
    
    
    private boolean showOrder;     // 同级地域顺序
    
    
    private Double longitude;     // 经度，高德
    
    
    private Double latitude;     // 纬度，高德
    
    
    private String geohash;     // 
    
    
    private String isCity;     // 是否为城市，1：是，0：非
    
    
    private String isArea;     // 是否为区县，1：是，0：非
    
    
    private String pinyinCode;     // 拼音编码
    
    
    private String arg0;     // 
    
    
    private String arg1;     // 
    
    
    private Date gmtModified;     // 
    
    
    private Date gmtCreated;     // 
    
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }
    
    public String getRegionId() {
        return this.regionId;
    }
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    
    public String getRegionName() {
        return this.regionName;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
    
    public String getPid() {
        return this.pid;
    }
    public void setShowOrder(boolean showOrder) {
        this.showOrder = showOrder;
    }
    
    public boolean getShowOrder() {
        return this.showOrder;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    
    public Double getLongitude() {
        return this.longitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    
    public Double getLatitude() {
        return this.latitude;
    }
    public void setGeohash(String geohash) {
        this.geohash = geohash;
    }
    
    public String getGeohash() {
        return this.geohash;
    }
    public void setIsCity(String isCity) {
        this.isCity = isCity;
    }
    
    public String getIsCity() {
        return this.isCity;
    }
    public void setIsArea(String isArea) {
        this.isArea = isArea;
    }
    
    public String getIsArea() {
        return this.isArea;
    }
    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode;
    }
    
    public String getPinyinCode() {
        return this.pinyinCode;
    }
    public void setArg0(String arg0) {
        this.arg0 = arg0;
    }
    
    public String getArg0() {
        return this.arg0;
    }
    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }
    
    public String getArg1() {
        return this.arg1;
    }
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
    
    public Date getGmtModified() {
        return this.gmtModified;
    }
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }
    
    public Date getGmtCreated() {
        return this.gmtCreated;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}