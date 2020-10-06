package com.hekai.micromall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@MapperScan("com.hekai.micromall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class MicromallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicromallProductApplication.class, args);
    }

}
