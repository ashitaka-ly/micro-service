package com.ly.springcloud.provider.service.impl;

import com.ly.springcloud.entity.SysUser;
import com.ly.springcloud.provider.dao.SysUserDao;
import com.ly.springcloud.provider.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ashitaka
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    /**
     * 新增系统用户
     *
     * @param sysUser
     * @return
     */
    @Override
    public boolean add(SysUser sysUser) {
        return sysUserDao.insert(sysUser);
    }

    /**
     * 获取单个用户
     *
     * @param id
     * @return
     */
    @Override
    public SysUser get(Long id) {
        return sysUserDao.get(id);
    }

    /**
     * 所有用户
     *
     * @return
     */
    @Override
    public List<SysUser> list() {
        return sysUserDao.list();
    }
}
