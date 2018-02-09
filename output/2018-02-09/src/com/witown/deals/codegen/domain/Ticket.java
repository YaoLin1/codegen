/*
 * Ticket.java 
 * Copyright(c) 2015 Treebear
 * ALL Rights Reserved.
 */
package com.witown.deals.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;
/**
 * 类Ticket的实现描述：wd_ticket-凭证
 * 
 * @author JianLin.Zhu 2015-07-27 19:36:00
 */
public class Ticket implements Serializable{
    
    private Long autoId;     // autoId
    
    
    private String ticket;     // 优惠条码
    
    
    private String thridPartyTicket;     // 第三方条码
    
    
    private String userId;     // 用户id
    
    
    private String couponId;     // 优惠券id
    
    
    private String mobile;     // 
    
    
    private String status;     // 状态：1、已领，2：已使用，3：到期失效
    
    
    private String shopId;     // 商家id
    
    
    private Date gmtCreated;     // 创建时间
    
    
    private Date gmtModified;     // 修改时间
    
    public void setAutoId(Long autoId) {
        this.autoId = autoId;
    }
    
    public Long getAutoId() {
        return this.autoId;
    }
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
    
    public String getTicket() {
        return this.ticket;
    }
    public void setThridPartyTicket(String thridPartyTicket) {
        this.thridPartyTicket = thridPartyTicket;
    }
    
    public String getThridPartyTicket() {
        return this.thridPartyTicket;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getUserId() {
        return this.userId;
    }
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
    
    public String getCouponId() {
        return this.couponId;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public String getMobile() {
        return this.mobile;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return this.status;
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
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}