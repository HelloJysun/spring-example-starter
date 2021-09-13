package com.example.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jysun
 * @since 2021/9/9
 */
@ConfigurationProperties(ExampleProperties.PREFIX)
public class ExampleProperties {

    public static final String PREFIX = "example.starter";

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
