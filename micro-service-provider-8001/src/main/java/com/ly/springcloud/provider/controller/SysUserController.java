package com.ly.springcloud.provider.controller;

import com.ly.springcloud.entity.SysUser;
import com.ly.springcloud.provider.service.SysUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户管理控制器
 *
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

    /**
     * 如果方法调用失败，抛出异常，则会自动执行 HystrixCommand 中标注的fallbackMethod中指定的方法
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/provider/sysUser/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public SysUser get(@PathVariable("id") Long id) {
        SysUser sysUser = sysUserService.get(id);
        if (null == sysUser) {
            throw new RuntimeException("没有找到ID" + id + "的信息");
        }
        return sysUser;
    }

    public SysUser hystrixGet(@PathVariable("id") Long id) {
        SysUser sysUser = new SysUser();
        sysUser.setName("no ID-" + id + " info");
        return sysUser;
    }


    @RequestMapping(value = "/provider/sysUser/list", method = RequestMethod.GET)
    public List<SysUser> list() {
        return sysUserService.list();
    }

}
