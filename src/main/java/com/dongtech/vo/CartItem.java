package com.dongtech.vo;

import java.io.Serializable;

/**
 *   购物车项
 *   @author  PF
 */
public class CartItem implements Serializable {
    private Cargoods carGoods;
    private int count;

    public Cargoods getCarGoods() {
        return carGoods;
    }

    public void setCarGoods(Cargoods carGoods) {
        this.carGoods = carGoods;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
