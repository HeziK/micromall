package com.hekai.micromall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class MicromallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicromallWareApplication.class, args);
    }

}
