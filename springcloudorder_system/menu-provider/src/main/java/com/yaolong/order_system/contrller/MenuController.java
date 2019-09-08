package com.yaolong.order_system.contrller;

import com.yaolong.order_system.entities.Menu;
import com.yaolong.order_system.entities.Type;
import com.yaolong.order_system.repository.MenuRepository;
import com.yaolong.order_system.repository.TypeRepository;
import com.yaolong.order_system.vo.CodeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    TypeRepository typeRepository;
    @GetMapping("/findAll/{index}/{limit}")
    public Map<String, Object> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit) {
        CodeMsg codeMsg = new CodeMsg(0, "", menuRepository.count());
        Map<String, Object> datas = new HashMap<>();
        datas.put("code", codeMsg.getCode());
        datas.put("msg", "");
        datas.put("count", codeMsg.getCount());
        datas.put("data", menuRepository.findAll(index, limit));
        return datas;
    }

    @GetMapping("/deleteById/{id}")
    public boolean deleteById(@PathVariable("id") long id) {
       int rs = menuRepository.deleteById(id);
        if (rs>0){
            return true;
        }
        return false;
    }


    @GetMapping("/findById/{id}")
    public Menu findById(@PathVariable("id") long id) {
        Menu menu = menuRepository.findById(id);
        System.out.println(menu);
        return menu;
    }


    @PostMapping("/save")
    public boolean save(@RequestBody Menu menu){
        System.out.println(menu+"------------------------>保存");
        int rs = menuRepository.save(menu);
        if (rs>0){
            return true;
        }
        return false;

    }

    @PostMapping("/update")
    public boolean update(@RequestBody Menu menu){
        System.out.println(menu+"---------->update");
        int rs = menuRepository.update(menu);
        if (rs>0){
            return true;
        }
        return false;
    }

    @GetMapping("/findTypes")
    public List<Type> findTypes(){
       return typeRepository.findAll();
    }

}
