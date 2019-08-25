package com.yaolong.springcloud.dao;

import com.yaolong.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yaoLong
 * @date 2019/8/25  13:35
 */
@Repository
public interface DeptDao {

    @Insert("INSERT INTO  dept(dname,db_source) VALUES(#{dname},DATABASE())")
    public boolean addDept(Dept dept);

    @Select("select  deptno,dname,db_source from  dept  where  deptno=#{deptno}")
    public Dept findById(Long id);

    @Select("select  deptno,dname,db_source from  dept")
    public List<Dept> findAll();
}
