package com.ly.springcloud.consumer.controller;

import com.ly.springcloud.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ashitaka
 */
@RestController
public class SysUserController {

    /**
     * 访问eureka上的provider注册的服务
     */
    private static final String REST_URL_PREFIX = "http://MICRO-SERVICE-PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add")
    public boolean add(SysUser sysUser) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/provider/sysUser/add", sysUser, Boolean.class);
    }

    @RequestMapping(value = "/get/{id}")
    public SysUser get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/provider/sysUser/get/" + id, SysUser.class);
    }

    @RequestMapping(value = "/list")
    public List<SysUser> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/provider/sysUser/list", List.class);
    }

}
