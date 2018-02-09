/*
 * Account.java 
 * Copyright(c) 2015 Treebear
 * ALL Rights Reserved.
 */
package com.witown.deals.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;
/**
 * 类Account的实现描述：wd_account-运营账户表
 * 
 * @author JianLin.Zhu 2015-07-27 19:36:00
 */
public class Account implements Serializable{
    
    private Long autoId;     // autoId
    
    
    private String accountId;     // 帐户Id
    
    
    private String password;     // 密码
    
    
    private String userName;     // 用户名
    
    
    private String role;     // 角色 1：运营，2：产品，3：管理员
    
    
    private Date gmtCreated;     // 创建时间
    
    
    private Date gmtModified;     // 修改时间
    
    
    private Date gmtLastLogin;     // 上次登录时间
    
    
    private String lastLoginIP;     // 上次登录ip
    
    public void setAutoId(Long autoId) {
        this.autoId = autoId;
    }
    
    public Long getAutoId() {
        return this.autoId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    public String getAccountId() {
        return this.accountId;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return this.password;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getUserName() {
        return this.userName;
    }
    public void setRole(String role) {
        this.role = role;
    }
    
    public String getRole() {
        return this.role;
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
    public void setGmtLastLogin(Date gmtLastLogin) {
        this.gmtLastLogin = gmtLastLogin;
    }
    
    public Date getGmtLastLogin() {
        return this.gmtLastLogin;
    }
    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP;
    }
    
    public String getLastLoginIP() {
        return this.lastLoginIP;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}