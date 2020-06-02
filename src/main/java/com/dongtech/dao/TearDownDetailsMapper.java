package com.dongtech.dao;

import com.dongtech.vo.TearDownDetails;


public interface TearDownDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TearDownDetails record);

    int insertSelective(TearDownDetails record);

    TearDownDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TearDownDetails record);

    int updateByPrimaryKey(TearDownDetails record);
}