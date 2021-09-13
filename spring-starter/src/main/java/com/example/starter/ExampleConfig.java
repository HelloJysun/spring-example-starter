package com.example.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author jysun
 * @since 2021/9/9
 */
@Configuration
@EnableConfigurationProperties(ExampleProperties.class)
public class ExampleConfig {

    @Resource
    private ExampleProperties exampleProperties;

    @Bean
    @ConditionalOnMissingBean
    public User user() {
        User user = new User();
        user.setName(exampleProperties.getName());
        user.setAge(exampleProperties.getAge());
        return user;
    }
}
