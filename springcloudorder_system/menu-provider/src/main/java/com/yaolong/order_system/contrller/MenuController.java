package com.yaolong.order_system.contrller;

import com.yaolong.order_system.entities.Menu;
import com.yaolong.order_system.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yaoLong
 * @date 2019/9/3  14:36
 */
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    MenuRepository menuRepository;
    @GetMapping("/findAll/{index}/{limit}")
    public List<Menu> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit) {
        return menuRepository.findAll(index, limit);
    }
//    @GetMapping("/findAll")
//    public List<Menu> findAll(){
//        return menuRepository.findAll();
//    }
}
