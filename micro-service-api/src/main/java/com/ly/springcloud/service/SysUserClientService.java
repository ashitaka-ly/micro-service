package com.ly.springcloud.service;

import com.ly.springcloud.entity.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 使用Feign替代Ribbon做负载均衡
 * 使用fallback表示服务调用失败的访问方法
 *
 * @author ashitaka
 */
@FeignClient(value = "MICRO-SERVICE-PROVIDER", fallbackFactory = SysUserClientServiceFallbackFactory.class)
public interface SysUserClientService {

    @RequestMapping(value = "/provider/sysUser/get/{id}", method = RequestMethod.GET)
    public SysUser get(@PathVariable("id") Long id);

    @RequestMapping(value = "/provider/sysUser/list", method = RequestMethod.GET)
    public List<SysUser> list();

    @RequestMapping(value = "/provider/sysUser/add", method = RequestMethod.POST)
    public boolean add(SysUser sysUser);

}
