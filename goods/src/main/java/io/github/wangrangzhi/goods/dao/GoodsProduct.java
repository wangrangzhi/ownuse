package io.github.wangrangzhi.goods.dao;

import lombok.Data;

import java.util.Date;

@Data
public class GoodsProduct {
    private String id;

    private String randomid;

    private String userid;

    private Date sendintime;

    private String goodsid;

    private String userlocation;

    private String goodstype;

    private String remark;

    private Integer store;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRandomid() {
        return randomid;
    }

    public void setRandomid(String randomid) {
        this.randomid = randomid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getSendintime() {
        return sendintime;
    }

    public void setSendintime(Date sendintime) {
        this.sendintime = sendintime;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public String getUserlocation() {
        return userlocation;
    }

    public void setUserlocation(String userlocation) {
        this.userlocation = userlocation;
    }

    public String getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(String goodstype) {
        this.goodstype = goodstype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }
}