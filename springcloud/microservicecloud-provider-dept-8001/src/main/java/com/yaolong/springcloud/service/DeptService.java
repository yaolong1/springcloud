package com.yaolong.springcloud.service;

import com.yaolong.springcloud.entities.Dept;

import java.util.List;

/**
 * @author yaoLong
 * @date 2019/8/25  14:09
 */
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
