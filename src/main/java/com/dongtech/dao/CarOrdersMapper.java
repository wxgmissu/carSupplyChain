package com.dongtech.dao;


import com.dongtech.vo.CarOrders;

public interface CarOrdersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarOrders record);

    int insertSelective(CarOrders record);

    CarOrders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarOrders record);

    int updateByPrimaryKey(CarOrders record);
}