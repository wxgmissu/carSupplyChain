package com.dongtech.vo;

/**
 * @author gzl
 * @date 2020-04-15
 * @program: springboot-jsp
 * @description: ${description}
 */
public class TearDownDetails {
    private Long id;
    private Integer orderId;
    private String produce;
    private String cargoodsName;
    private Integer num;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public String getCargoodsName() {
        return cargoodsName;
    }

    public void setCargoodsName(String cargoodsName) {
        this.cargoodsName = cargoodsName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public TearDownDetails() {
    }

    public TearDownDetails(Long id, Integer orderId, String produce, String cargoodsName, Integer num) {
        this.id = id;
        this.orderId = orderId;
        this.produce = produce;
        this.cargoodsName = cargoodsName;
        this.num = num;
    }
}
