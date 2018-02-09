/*
 * Shop.java 
 * Copyright(c) 2015 Treebear
 * ALL Rights Reserved.
 */
package com.witown.deals.domain;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;
/**
 * 类Shop的实现描述：wd_shop-有卖商家表
 * 
 * @author JianLin.Zhu 2015-07-27 19:36:00
 */
public class Shop implements Serializable{
    
    private Long id;     // 
    
    
    private String merchantid;     // 商家id
    
    
    private String merchanturl;     // 
    
    
    private String category;     // 
    
    
    private String subcategory;     // 
    
    
    private String city;     // 城市
    
    
    private String cityname;     // 
    
    
    private String area;     // 区域
    
    
    private String areaname;     // 
    
    
    private String bizarea;     // 
    
    
    private String bizareaname;     // 
    
    
    private String title;     // 商家名称
    
    
    private String mainpic;     // 主图
    
    
    private String description;     // 描述
    
    
    private String address;     // 地址
    
    
    private String phone;     // 联系电话
    
    
    private Double longitude;     // 经度
    
    
    private Double latitude;     // 纬度
    
    
    private Integer soldnum;     // 
    
    
    private Integer productnum;     // 
    
    
    private Integer minprice;     // 
    
    
    private Integer maxprice;     // 
    
    
    private String website;     // 来源：1、wifi商家导入，2：自录入，3：银行商家
    
    
    private String geohash;     // 
    
    
    private String pinyintitle;     // 
    
    
    private String relamerchants;     // 
    
    
    private String isDelete;     // 是否删除 1:删除 0：正常
    
    
    private Date gmtCreated;     // 创建时间
    
    
    private Date gmtModified;     // 修改时间
    
    
    private String mdpoutwebsite;     // 
    
    
    private String treebearid;     // 
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid;
    }
    
    public String getMerchantid() {
        return this.merchantid;
    }
    public void setMerchanturl(String merchanturl) {
        this.merchanturl = merchanturl;
    }
    
    public String getMerchanturl() {
        return this.merchanturl;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    
    public String getCategory() {
        return this.category;
    }
    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }
    
    public String getSubcategory() {
        return this.subcategory;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCity() {
        return this.city;
    }
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }
    
    public String getCityname() {
        return this.cityname;
    }
    public void setArea(String area) {
        this.area = area;
    }
    
    public String getArea() {
        return this.area;
    }
    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }
    
    public String getAreaname() {
        return this.areaname;
    }
    public void setBizarea(String bizarea) {
        this.bizarea = bizarea;
    }
    
    public String getBizarea() {
        return this.bizarea;
    }
    public void setBizareaname(String bizareaname) {
        this.bizareaname = bizareaname;
    }
    
    public String getBizareaname() {
        return this.bizareaname;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return this.title;
    }
    public void setMainpic(String mainpic) {
        this.mainpic = mainpic;
    }
    
    public String getMainpic() {
        return this.mainpic;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAddress() {
        return this.address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPhone() {
        return this.phone;
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
    public void setSoldnum(Integer soldnum) {
        this.soldnum = soldnum;
    }
    
    public Integer getSoldnum() {
        return this.soldnum;
    }
    public void setProductnum(Integer productnum) {
        this.productnum = productnum;
    }
    
    public Integer getProductnum() {
        return this.productnum;
    }
    public void setMinprice(Integer minprice) {
        this.minprice = minprice;
    }
    
    public Integer getMinprice() {
        return this.minprice;
    }
    public void setMaxprice(Integer maxprice) {
        this.maxprice = maxprice;
    }
    
    public Integer getMaxprice() {
        return this.maxprice;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    
    public String getWebsite() {
        return this.website;
    }
    public void setGeohash(String geohash) {
        this.geohash = geohash;
    }
    
    public String getGeohash() {
        return this.geohash;
    }
    public void setPinyintitle(String pinyintitle) {
        this.pinyintitle = pinyintitle;
    }
    
    public String getPinyintitle() {
        return this.pinyintitle;
    }
    public void setRelamerchants(String relamerchants) {
        this.relamerchants = relamerchants;
    }
    
    public String getRelamerchants() {
        return this.relamerchants;
    }
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
    
    public String getIsDelete() {
        return this.isDelete;
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
    public void setMdpoutwebsite(String mdpoutwebsite) {
        this.mdpoutwebsite = mdpoutwebsite;
    }
    
    public String getMdpoutwebsite() {
        return this.mdpoutwebsite;
    }
    public void setTreebearid(String treebearid) {
        this.treebearid = treebearid;
    }
    
    public String getTreebearid() {
        return this.treebearid;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}