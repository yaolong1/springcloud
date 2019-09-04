package com.yaolong.order_system.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaoLong
 * @date 2019/9/2  21:54
 */
@RestController
@RequestMapping("/order")
public class OrderHandler {

    @Value("${server.port}")
    private String port;
    @GetMapping("/index")
    public String index(){
        return  "order的端口号为："+this.port;
    }
}
