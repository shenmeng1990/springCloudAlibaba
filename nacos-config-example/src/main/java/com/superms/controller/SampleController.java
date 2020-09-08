package com.superms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author shenmeng
 * @Date 2020/9/8
 **/
@RefreshScope
@RestController
public class SampleController {

    @Value("${user.name}")
    String userName;

    @Value("${user.age}")
    int age;

    @RequestMapping("/user")
    public String simple() {
        return "Hello Nacos Config!" + "Hello " + userName + " " + age ;
    }

}
