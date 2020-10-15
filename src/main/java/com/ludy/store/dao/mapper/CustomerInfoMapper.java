package com.ludy.store.dao.mapper;

import com.ludy.store.model.entity.CustomerInfo;

/**
 * 用户信息mapper接口
 */
public interface CustomerInfoMapper {
    Integer deleteByPrimaryKey(String customerNo);

    Integer insert(CustomerInfo record);

    Integer insertSelective(CustomerInfo record);

    CustomerInfo selectByPrimaryKey(String customerNo);

    Integer updateByPrimaryKeySelective(CustomerInfo record);

    Integer updateByPrimaryKey(CustomerInfo record);
}