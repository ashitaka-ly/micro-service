package com.ly.springcloud.provider.dao;

import com.ly.springcloud.entity.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ashitaka
 */
@Repository
@Mapper
public interface SysUserDao {

    @Insert("insert into sys_user (name, password) values (#{name}, #{password})")
    boolean insert(SysUser sysUser);

    @Select("select id, name, password from sys_user where id = #{id}")
    SysUser get(Long id);

    @Select("select id, name, password from sys_user")
    List<SysUser> list();

}
