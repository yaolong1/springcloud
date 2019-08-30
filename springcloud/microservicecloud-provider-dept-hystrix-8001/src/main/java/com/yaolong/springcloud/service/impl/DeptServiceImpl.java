package com.yaolong.springcloud.service.impl;

import com.yaolong.springcloud.dao.DeptDao;
import com.yaolong.springcloud.entities.Dept;
import com.yaolong.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yaoLong
 * @date 2019/8/25  14:10
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired()
    private DeptDao dao;

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }


    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }


    @Override
    public List<Dept> list() {
        return dao.findAll();
    }


}
