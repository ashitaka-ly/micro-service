package com.ly.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ashitaka
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderApplication8002 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication8002.class, args);
    }

}
