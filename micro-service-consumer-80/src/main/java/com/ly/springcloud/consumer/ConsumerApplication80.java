package com.ly.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ashitaka
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.ly.springcloud"})
@ComponentScan("com.ly.springcloud")
public class ConsumerApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication80.class, args);
    }

}
