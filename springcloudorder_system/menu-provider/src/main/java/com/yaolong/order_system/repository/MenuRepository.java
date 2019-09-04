package com.yaolong.order_system.repository;

import com.yaolong.order_system.entities.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yaoLong
 * @date 2019/9/3  15:50
 */
@Mapper
public interface MenuRepository {
    public List<Menu> findAll(@Param("index") int index, @Param("limit") int limit);
//    public List<Menu> findAll();

    public int count();

    public Menu findById(Long id);

    public void save(Menu menu);

    public void update(Menu menu);

    public void deleteById(Long id);

}
