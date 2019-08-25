package com.yaolong.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yaoLong
 * @date 2019/8/25  14:14
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.yaolong.springcloud.dao")
public class DeptProvider8001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class,args);
    }
}