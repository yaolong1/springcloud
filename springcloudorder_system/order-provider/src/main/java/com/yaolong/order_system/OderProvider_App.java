package com.yaolong.order_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yaoLong
 * @date 2019/9/2  21:39
 */
@SpringBootApplication
@EnableEurekaClient
public class OderProvider_App {
    public static void main(String[] args) {
        SpringApplication.run(OderProvider_App.class,args);
    }
}
