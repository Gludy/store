package com.ludy.store.dao.mapper;

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 批量处理dao
 */
@Repository
public class BatchOperateDao {

    @Resource
    CustomerInfoMapper customerInfoMapper;


}
