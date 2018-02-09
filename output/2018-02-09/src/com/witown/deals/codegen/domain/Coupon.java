/*
 * Coupon.java 
 * Copyright(c) 2015 Treebear
 * ALL Rights Reserved.
 */
package com.witown.deals.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;
/**
 * 类Coupon的实现描述：wd_coupon-有卖优惠券表
 * 
 * @author JianLin.Zhu 2015-07-27 19:36:00
 */
public class Coupon implements Serializable{
    
    private Long autoId;     // autoId
    
    
    private String couponId;     // 优惠券id
    
    
    private Date startTime;     // 生效时间
    
    
    private Date endTime;     // 失效时间
    
    
    private String instructions;     // 使用说明
    
    
    private String type;     // 类型 1：折扣，2：优惠券
    
    
    private Integer oldPrice;     // 原价(单位分)
    
    
    private Integer worth;     // 面额或折扣
    
    
    private String shopId;     // 商家id
    
    
    private Date gmtCreated;     // 创建时间
    
    
    private Date gmtModified;     // 修改时间
    
    
    private String mobile;     // 
    
    
    private String userId;     // 
    
    
    private String title;     // 
    
    
    private String status;     // 
    
    public void setAutoId(Long autoId) {
        this.autoId = autoId;
    }
    
    public Long getAutoId() {
        return this.autoId;
    }
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
    
    public String getCouponId() {
        return this.couponId;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    
    public Date getStartTime() {
        return this.startTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
    public Date getEndTime() {
        return this.endTime;
    }
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    
    public String getInstructions() {
        return this.instructions;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return this.type;
    }
    public void setOldPrice(Integer oldPrice) {
        this.oldPrice = oldPrice;
    }
    
    public Integer getOldPrice() {
        return this.oldPrice;
    }
    public void setWorth(Integer worth) {
        this.worth = worth;
    }
    
    public Integer getWorth() {
        return this.worth;
    }
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
    
    public String getShopId() {
        return this.shopId;
    }
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }
    
    public Date getGmtCreated() {
        return this.gmtCreated;
    }
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
    
    public Date getGmtModified() {
        return this.gmtModified;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public String getMobile() {
        return this.mobile;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getUserId() {
        return this.userId;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return this.title;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}