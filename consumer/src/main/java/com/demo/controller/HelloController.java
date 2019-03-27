package com.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.HelloService;

/**
 * @author wangyu
 * 2019/03/26 22:07
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Reference(version = "1.0.0", check = false)
    private HelloService helloService;

    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name) {
        return helloService.sayHello(name);
    }
}
