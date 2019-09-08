package com.yaolong.order_system.controller;

import com.yaolong.order_system.entities.Menu;
import com.yaolong.order_system.entities.Type;
import com.yaolong.order_system.service.FeginServiceConsumer;
import com.yaolong.order_system.vo.MsgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author yaoLong
 * @date 2019/9/3  23:04
 */
@RestController
@RequestMapping("/consumer/menu")
@CrossOrigin
public class ConsumerMenuController {

    @Autowired
    FeginServiceConsumer serviceConsumer;

    Map<String, Object> data;

    @GetMapping("/findAll")
    public Map<String, Object> findAll(@RequestParam("page") int page, @RequestParam("limit") int limit) {
        int index = (page - 1) * limit;
        return serviceConsumer.findAll(index, limit);
    }

    @GetMapping("/deleteById/{id}")
    public Map<String, Object> deleteById(@PathVariable("id") long id) {
        boolean rs = serviceConsumer.deleteById(id);
        data = new HashMap<>();
        if (rs) {
            data.put("msg", MsgUtil.MSG_SUCCESS_DELETE);
            data.put("code", MsgUtil.CODE_SUCCESS);
            return data;
        }
        data.put("msg", MsgUtil.MSG_FAILURE_DELETE);
        data.put("code", MsgUtil.CODE_FAILURE);
        return data;
    }

    @GetMapping("/findById/{id}")
    public Menu findById(@PathVariable("id") long id) {
        return serviceConsumer.findById(id);
    }

    @PostMapping("/save")
    public Map<String, Object> save(@RequestBody Menu menu) {
        System.out.println(menu);
        boolean rs = serviceConsumer.save(menu);
        data = new HashMap<>();
        if (rs) {
            data.put("msg", MsgUtil.MSG_SUCCESS_SAVE);
            data.put("code", MsgUtil.CODE_SUCCESS);
            return data;
        }
        data.put("msg", MsgUtil.MSG_FAILURE_SAVE);
        data.put("code", MsgUtil.CODE_FAILURE);
        return data;
    }


    @PostMapping("/update")
    public Map<String, Object> update(@RequestBody Menu menu) {
        System.out.println(menu+"---------->update");
        boolean rs = serviceConsumer.update(menu);
        data = new HashMap<>();
        if (rs) {
            data.put("msg", MsgUtil.MSG_SUCCESS_UPDATE);
            data.put("code", MsgUtil.CODE_SUCCESS);
            return data;
        }
        data.put("msg", MsgUtil.MSG_FAILURE_UPDATE);
        data.put("code", MsgUtil.CODE_FAILURE);
        return data;
    }

    @GetMapping("/findTypes")
    public List<Type> findTypes(){
        List<Type> types = serviceConsumer.findTypes();
        return  types;
    }

}
