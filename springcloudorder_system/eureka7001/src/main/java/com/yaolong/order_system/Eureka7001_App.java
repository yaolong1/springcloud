package com.yaolong.order_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yaoLong
 * @date 2019/9/3  8:49
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7001_App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7001_App.class,args);
    }
}
