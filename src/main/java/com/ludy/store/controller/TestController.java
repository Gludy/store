package com.ludy.store.controller;

import com.ludy.store.model.params.TestParam;
import com.ludy.store.model.response.ResultInfo;
import com.ludy.store.model.response.TestResult;
import com.ludy.store.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("test")
@Slf4j
public class TestController {

    @Resource
    private TestService service;

    @GetMapping("func")
    public ResultInfo<TestResult> func(TestParam param) {
        log.info("测试");
        if (service.getResult(param.getCheck().equals(1))) {
            return ResultInfo.success(TestResult
                    .builder()
                    .a(1)
                    .b(2)
                    .build());
        } else {
            return ResultInfo.fail(new TestResult(), "失败测试");
        }
    }
}
