package com.yaolong.order_system.repository;

import com.yaolong.order_system.entities.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yaoLong
 * @date 2019/9/5  1:00
 */
@Repository
public interface TypeRepository {

    public Type findById(long id);

    public List<Type> findAll();


}
