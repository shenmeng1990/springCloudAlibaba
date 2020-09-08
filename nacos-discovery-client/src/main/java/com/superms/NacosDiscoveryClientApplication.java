package com.superms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author shenmeng
 */
@SpringBootApplication
@EnableDiscoveryClient(autoRegister = true)
@EnableFeignClients
public class NacosDiscoveryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosDiscoveryClientApplication.class, args);
	}

}
