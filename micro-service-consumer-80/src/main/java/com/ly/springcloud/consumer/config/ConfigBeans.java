package com.ly.springcloud.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ashitaka
 */
@Configuration
public class ConfigBeans {

    /**
     * 配置REST方式调用的Bean
     * LoadBalanced 表示使用Ribbon，其是基于Netflix Ribbon实现的一套客户端负载均衡工具
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
