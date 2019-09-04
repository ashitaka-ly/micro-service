package com.ly.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * EnableEurekaClient 注解表示：服务启动后，会自动注册到配置的eureka服务中
 * EnableCircuitBreaker 表示对hystrix榕断器的支持
 *
 * @author ashitaka
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class ProviderApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication8001.class, args);
    }

}
