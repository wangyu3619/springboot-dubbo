package com.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.service.HelloService;

/**
 * @author wangyu
 * 2019/03/26 21:16
 */
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
