package com.yaolong.springcloud.service;

import com.yaolong.springcloud.entities.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author yaoLong
 * @date 2019/8/29  18:02
 */
@SuppressWarnings("all")
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory =DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);


    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();


    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept);
}
