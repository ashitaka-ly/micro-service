package com.ly.springcloud.consumer.controller;

import com.ly.springcloud.entity.SysUser;
import com.ly.springcloud.service.SysUserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 2019-09-02: 替换Feign作为负载均衡
 *
 * @author ashitaka
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserClientService sysUserClientService;

    @RequestMapping(value = "/get/{id}")
    public SysUser get(@PathVariable("id") Long id) {
        return sysUserClientService.get(id);
    }

    @RequestMapping(value = "/list")
    public List<SysUser> list() {
        return sysUserClientService.list();
    }

    @RequestMapping(value = "/add")
    public boolean add(SysUser sysUser) {
        return sysUserClientService.add(sysUser);
    }
}
