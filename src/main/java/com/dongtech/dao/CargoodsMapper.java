package com.dongtech.dao;


import com.dongtech.vo.Cargoods;

public interface CargoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Cargoods record);

    int insertSelective(Cargoods record);

    Cargoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Cargoods record);

    int updateByPrimaryKey(Cargoods record);
}