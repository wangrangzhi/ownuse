package io.github.wangrangzhi.goods.dao;

import lombok.Data;

import java.util.Date;
@Data
public class OrderProduct {
    private String id;

    private String buyerid;

    private String goodsid;

    private Date buyingtime;

    private String goodstype;

    private Integer buyingamount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(String buyerid) {
        this.buyerid = buyerid;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public Date getBuyingtime() {
        return buyingtime;
    }

    public void setBuyingtime(Date buyingtime) {
        this.buyingtime = buyingtime;
    }

    public String getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(String goodstype) {
        this.goodstype = goodstype;
    }

    public Integer getBuyingamount() {
        return buyingamount;
    }

    public void setBuyingamount(Integer buyingamount) {
        this.buyingamount = buyingamount;
    }
}