package com.ludy.store.service.impl;

import com.ludy.store.dao.mapper.CustomerInfoMapper;
import com.ludy.store.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {
    @Resource
    CustomerInfoMapper customerInfoMapper;

    @Override
    public Boolean getResult(Boolean r) {
        customerInfoMapper.selectByPrimaryKey("1");
        return r;
    }
}
