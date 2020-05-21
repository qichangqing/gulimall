package com.qcq.gulimall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GulimallOrderMain {
    public static void main(String[] args) {
        SpringApplication.run(GulimallOrderMain.class,args);
    }
}
