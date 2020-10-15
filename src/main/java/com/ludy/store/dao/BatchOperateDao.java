package com.ludy.store.dao;

import com.ludy.store.dao.mapper.CustomerInfoMapper;
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
