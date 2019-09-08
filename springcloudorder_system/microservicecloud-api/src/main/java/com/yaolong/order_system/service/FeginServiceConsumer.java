package com.yaolong.order_system.service;

import com.yaolong.order_system.entities.Menu;
import com.yaolong.order_system.entities.Type;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author yaoLong
 * @date 2019/9/3  23:11
 */
@SuppressWarnings("all")
@FeignClient(value = "ZUUL-GATEWAY"/*,fallbackFactory = FeginServiceConsumerFallbackFactory.class*/)
public interface FeginServiceConsumer extends Serializable {
    @GetMapping("/yaolong/menuprovider/menu/findAll/{index}/{limit}")
    public Map<String, Object> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit);


    //    public int count();
    @GetMapping("/yaolong/menuprovider/menu/findById/{id}")
    public Menu findById(@PathVariable("id") long id);
//
//    public void save(Menu menu);
//
//    public void update(Menu menu);
    @GetMapping("/yaolong/menuprovider/menu/deleteById/{id}")
    public boolean deleteById(@PathVariable("id") long id);

    @PostMapping("/yaolong/menuprovider/menu/save")
    public boolean save(@RequestBody Menu menu);

    @PostMapping("/yaolong/menuprovider/menu/update")
    public boolean update(@RequestBody Menu menu);

    @GetMapping("/yaolong/menuprovider/menu/findTypes")
    public List<Type> findTypes();

}
