package com.superms.controller;

import com.superms.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author shenmeng
 * @Date 2020/9/8
 **/
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EchoService echoService;

    /**
     * redisTemplate 方式调用
     * @param str
     * @return
     */
    @GetMapping(value="/echo-rest/{str}")
    public String rest(@PathVariable String str) {
        return restTemplate.getForObject("http://nacos-discovery-server/echo/" + str,
                String.class);
    }

    /**
     * feign client 方式调用
     * @param str
     * @return
     */
    @GetMapping(value = "/echo-feign/{str}")
    public String feign(@PathVariable String str) {
        return echoService.echo(str);
    }

}
