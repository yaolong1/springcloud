package com.yaolong.order_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yaoLong
 * @date 2019/9/3  14:37
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.yaolong.order_system.repository")
public class MenuProvider_App {
    public static void main(String[] args) {
        SpringApplication.run(MenuProvider_App.class,args);
    }
}
