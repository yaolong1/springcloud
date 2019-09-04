package com.yaolong.order_system.service;

import com.yaolong.order_system.entities.Menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @author yaoLong
 * @date 2019/9/3  23:11
 */
@SuppressWarnings("all")
@FeignClient(value = "ZUUL-GATEWAY"/*,fallbackFactory = FeginServiceConsumerFallbackFactory.class*/)
public interface FeginServiceConsumer {
    @GetMapping("/yaolong/menuprovider/menu/findAll/{index}/{limit}")
    public Map<String,Object> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit);
//@GetMapping("/yaolong/menuprovider/menu/findAll")
//public List<Menu> findAll();

//    public int count();
//
//    public Menu findById(Long id);
//
//    public void save(Menu menu);
//
//    public void update(Menu menu);
//
//    public void deleteById(Long id);

}
