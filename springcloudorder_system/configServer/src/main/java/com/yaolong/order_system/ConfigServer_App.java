package com.yaolong.order_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yaoLong
 * @date 2019/9/2  21:28
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServer_App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_App.class,args);
    }
}
