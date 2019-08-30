package com.ly.springcloud.provider.service;

import com.ly.springcloud.entity.SysUser;

import java.util.List;

/**
 * @author ashitaka
 */
public interface SysUserService {

    /**
     * 新增系统用户
     *
     * @param sysUser
     * @return
     */
    boolean add(SysUser sysUser);

    /**
     * 获取单个用户
     *
     * @param id
     * @return
     */
    SysUser get(Long id);

    /**
     * 所有用户
     *
     * @return
     */
    List<SysUser> list();

}
