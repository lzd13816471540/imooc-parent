package com.imooc.tickets;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan(basePackages = {"com.imooc.tickets.mapper"})
@EnableDiscoveryClient
@SpringBootApplication
public class ImoocTicketsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImoocTicketsApplication.class,args);
    }
}
