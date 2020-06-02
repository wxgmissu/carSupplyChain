package com.dongtech.vo;

import java.math.BigDecimal;

/**
 * @author gzl
 * @date 2020-04-15
 * @program: springboot-jsp
 * @description: ${description}
 */
public class CarOrdersDetails {
    private Long id;
    private String goodsName;
    private Integer num;
    //出厂地址
    private String produce;
    //单价
    private BigDecimal price;

    private Integer orderId;

    public CarOrdersDetails() {
    }

    public CarOrdersDetails(Long id, String goodsName, Integer num, String produce, BigDecimal price, Integer orderId) {
        this.id = id;
        this.goodsName = goodsName;
        this.num = num;
        this.produce = produce;
        this.price = price;
        this.orderId = orderId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
