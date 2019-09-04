package com.yaolong.order_system.controller;

import com.yaolong.order_system.entities.Menu;
import com.yaolong.order_system.service.FeginServiceConsumer;
import com.yaolong.order_system.vo.CodeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author yaoLong
 * @date 2019/9/3  23:04
 */
@RestController
@RequestMapping("/consumer")
@CrossOrigin
public class ConsumerMenuController {

    @Autowired
    FeginServiceConsumer serviceConsumer = null;

    @GetMapping("/menu/findAll")
    public Map<String,Object> findAll(@RequestParam("page") int page, @RequestParam("limit") int limit) {
        int index = (page-1)* limit;
        Map<String,Object> datas = new HashMap<>();
        datas.put("code",0);
        datas.put("msg","");
        datas.put("count",100);
        datas.put("data",serviceConsumer.findAll(index, limit));
        return datas;
    }
//    @GetMapping("/menu/findAll")
//    public List<Menu> findAll() {
//        return serviceConsumer.findAll();
//    }
}
