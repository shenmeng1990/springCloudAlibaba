package com.superms.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author shenmeng
 * @Date 2020/9/8
 **/
@FeignClient(name="nacos-discovery-server")
public interface EchoService {

    @GetMapping(value = "/echo/{str}")
    String echo(@PathVariable("str") String str);

}
