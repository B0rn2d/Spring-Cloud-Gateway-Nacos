package com.test;

import org.springframework.cloud.alibaba.nacos.NacosDiscoveryProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NacosDiscoveryPropertiesConfig {

    @Bean
    public NacosDiscoveryProperties nacosDiscoveryProperties(){
        return new NacosDiscoveryProperties();
    }
}
