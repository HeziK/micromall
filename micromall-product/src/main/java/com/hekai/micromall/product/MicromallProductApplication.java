package com.hekai.micromall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.hekai.micromall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class MicromallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicromallProductApplication.class, args);
    }

}
