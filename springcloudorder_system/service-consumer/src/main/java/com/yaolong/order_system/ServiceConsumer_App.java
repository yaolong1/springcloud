package com.yaolong.order_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yaoLong
 * @date 2019/9/3  22:20
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.yaolong.order_system")
public class ServiceConsumer_App {
    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumer_App.class, args);
    }
}
