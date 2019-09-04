package com.yaolong.order_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yaoLong
 * @date 2019/9/4  18:44
 */
@Controller
public class TestController {

    @GetMapping("/index/{location}")
    public String index(@PathVariable("location") String location){
        return location;
    }
}
