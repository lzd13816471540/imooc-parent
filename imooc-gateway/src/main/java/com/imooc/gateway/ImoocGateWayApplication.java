package com.imooc.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ImoocGateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ImoocGateWayApplication.class,args);
    }
}
