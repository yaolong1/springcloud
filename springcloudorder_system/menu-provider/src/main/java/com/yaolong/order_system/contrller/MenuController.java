package com.yaolong.order_system.contrller;

import com.yaolong.order_system.entities.Menu;
import com.yaolong.order_system.repository.MenuRepository;
import com.yaolong.order_system.vo.CodeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Map<String,Object> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit) {
        CodeMsg codeMsg = new CodeMsg(0,"",menuRepository.count());
        Map<String,Object> datas = new HashMap<>();
        datas.put("code",codeMsg.getCode());
        datas.put("msg","");
        datas.put("count",codeMsg.getCount());
        datas.put("data",menuRepository.findAll(index, limit));
        return datas;
    }
//    @GetMapping("/findAll")
//    public List<Menu> findAll(){
//        return menuRepository.findAll();
//    }
}
