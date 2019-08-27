package com.ly.springcloud.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ashitaka
 */
@Configuration
public class ConfigBeans {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
