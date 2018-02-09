/*
 * Activity.java 
 * Copyright(c) 2015 Treebear
 * ALL Rights Reserved.
 */
package com.witown.deals.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;
/**
 * 类Activity的实现描述：wd_activity-活动表
 * 
 * @author JianLin.Zhu 2015-07-27 19:36:00
 */
public class Activity implements Serializable{
    
    private Long autoId;     // autoId
    
    
    private String actid;     // 活动id
    
    
    private String lanmu;     // 归属栏目
    
    
    private String url;     // 链接
    
    
    private String title;     // 标题
    
    
    private String content;     // 内容
    
    
    private String pic;     // 主图
    
    
    private Date startTime;     // 开始时间
    
    
    private Date endTime;     // 结束时间
    
    
    private String status;     // 状态：1：草稿，2：正式
    
    
    private String lastOperator;     // 最近修改人
    
    
    private Date gmtLastModified;     // 最近修改时间
    
    
    private String regionId;     // 区域编码
    
    
    private String city;     // 城市，all表示全部
    
    
    private Double rank;     // 排序(越大越靠前)
    
    public void setAutoId(Long autoId) {
        this.autoId = autoId;
    }
    
    public Long getAutoId() {
        return this.autoId;
    }
    public void setActid(String actid) {
        this.actid = actid;
    }
    
    public String getActid() {
        return this.actid;
    }
    public void setLanmu(String lanmu) {
        this.lanmu = lanmu;
    }
    
    public String getLanmu() {
        return this.lanmu;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getUrl() {
        return this.url;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return this.title;
    }
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return this.content;
    }
    public void setPic(String pic) {
        this.pic = pic;
    }
    
    public String getPic() {
        return this.pic;
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
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return this.status;
    }
    public void setLastOperator(String lastOperator) {
        this.lastOperator = lastOperator;
    }
    
    public String getLastOperator() {
        return this.lastOperator;
    }
    public void setGmtLastModified(Date gmtLastModified) {
        this.gmtLastModified = gmtLastModified;
    }
    
    public Date getGmtLastModified() {
        return this.gmtLastModified;
    }
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }
    
    public String getRegionId() {
        return this.regionId;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCity() {
        return this.city;
    }
    public void setRank(Double rank) {
        this.rank = rank;
    }
    
    public Double getRank() {
        return this.rank;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}