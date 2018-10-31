package com.xue.springlearning.dao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="author" )
public class AuthorSettings {
    private  String name;
    private Long age;

    public String getName() {
        return name;
    }

    public Long getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
