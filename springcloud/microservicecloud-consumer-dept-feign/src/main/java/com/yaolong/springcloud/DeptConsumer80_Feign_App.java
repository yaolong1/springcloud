package com.yaolong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author yaoLong
 * @date 2019/8/25  15:46
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.yaolong.springcloud")
public class DeptConsumer80_Feign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }
}