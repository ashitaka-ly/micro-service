package com.ly.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * EnableEurekaClient注解表示：服务启动后，会自动注册到配置的eureka服务中
 *
 * @author ashitaka
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication8001.class, args);
    }

}
