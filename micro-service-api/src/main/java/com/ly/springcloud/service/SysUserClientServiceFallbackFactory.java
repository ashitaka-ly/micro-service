package com.ly.springcloud.service;

import com.ly.springcloud.entity.SysUser;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 对整个SysUserClientService 提供熔断服务，在这个接口访问异常时，能够给出错误信息
 *
 * @author ashitaka
 */
@Component
public class SysUserClientServiceFallbackFactory implements FallbackFactory<SysUserClientService> {
    @Override
    public SysUserClientService create(Throwable throwable) {
        return new SysUserClientService() {
            @Override
            public SysUser get(Long id) {
                SysUser error = new SysUser();
                error.setName("no ID-" + id + " find");
                return error;
            }

            @Override
            public List<SysUser> list() {
                return null;
            }

            @Override
            public boolean add(SysUser sysUser) {
                return false;
            }
        };
    }
}
