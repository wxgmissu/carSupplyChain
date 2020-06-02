package com.dongtech.dao;


import com.dongtech.vo.CarOrdersDetails;

public interface CarOrdersDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarOrdersDetails record);

    int insertSelective(CarOrdersDetails record);

    CarOrdersDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarOrdersDetails record);

    int updateByPrimaryKey(CarOrdersDetails record);
}