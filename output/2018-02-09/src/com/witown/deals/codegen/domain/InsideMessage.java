/*
 * InsideMessage.java 
 * Copyright(c) 2015 Treebear
 * ALL Rights Reserved.
 */
package com.witown.deals.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;
/**
 * 类InsideMessage的实现描述：wd_inside_message-站内信
 * 
 * @author JianLin.Zhu 2015-07-27 19:36:00
 */
public class InsideMessage implements Serializable{
    
    private Long id;     // id
    
    
    private String type;     // 消息类型1.新手消息 2.系统消息 3.活动消息
    
    
    private String title;     // 标题
    
    
    private String content;     // 内容
    
    
    private Date sendTime;     // 发送时间
    
    
    private String target;     // 目标 all：给全部用户，用户id：点对点
    
    
    private String status;     // 状态0.正常 1.删除
    
    
    private String extra;     // 
    
    
    private Date gmtCreated;     // 创建时间
    
    
    private Date gmtModified;     // 修改时间
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return this.type;
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
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
    
    public Date getSendTime() {
        return this.sendTime;
    }
    public void setTarget(String target) {
        this.target = target;
    }
    
    public String getTarget() {
        return this.target;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return this.status;
    }
    public void setExtra(String extra) {
        this.extra = extra;
    }
    
    public String getExtra() {
        return this.extra;
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