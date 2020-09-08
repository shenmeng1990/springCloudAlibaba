package com.superms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shenmeng
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosDiscoveryServerApplication.class, args);
	}

}
