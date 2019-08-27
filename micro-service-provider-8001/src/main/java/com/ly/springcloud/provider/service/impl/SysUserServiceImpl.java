package com.ly.springcloud.provider.service.impl;

import com.ly.springcloud.entity.SysUser;
import com.ly.springcloud.provider.service.SysUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashitaka
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    /**
     * 新增系统用户
     *
     * @param sysUser
     * @return
     */
    @Override
    public boolean add(SysUser sysUser) {
        System.out.println("to add a sysUser :" + sysUser);
        return true;
    }

    /**
     * 获取单个用户
     *
     * @param id
     * @return
     */
    @Override
    public SysUser get(Long id) {
        List<SysUser> sysUserList = new ArrayList<>();
        SysUser sysUserA = new SysUser(100L, "Andy", "qui123");
        SysUser sysUserB = new SysUser(101L, "Bob", "0001120");
        sysUserList.add(sysUserA);
        sysUserList.add(sysUserB);

        return sysUserList.get(id.intValue());
    }

    /**
     * 所有用户
     *
     * @return
     */
    @Override
    public List<SysUser> list() {
        List<SysUser> sysUserList = new ArrayList<>();
        SysUser sysUserA = new SysUser(100L, "Andy", "12341");
        SysUser sysUserB = new SysUser(101L, "Bob", "43253");
        sysUserList.add(sysUserA);
        sysUserList.add(sysUserB);

        return sysUserList;
    }
}
