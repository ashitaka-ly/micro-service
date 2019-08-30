package com.ly.springcloud.provider.controller;

import com.ly.springcloud.entity.SysUser;
import com.ly.springcloud.provider.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ashitaka
 */
@RestController
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/provider/sysUser/add", method = RequestMethod.POST)
    public boolean add(@RequestBody SysUser sysUser) {
        return sysUserService.add(sysUser);
    }

    @RequestMapping(value = "/provider/sysUser/get/{id}", method = RequestMethod.GET)
    public SysUser get(@PathVariable("id") Long id) {
        return sysUserService.get(id);
    }

    @RequestMapping(value = "/provider/sysUser/list", method = RequestMethod.GET)
    public List<SysUser> list() {
        return sysUserService.list();
    }

}
