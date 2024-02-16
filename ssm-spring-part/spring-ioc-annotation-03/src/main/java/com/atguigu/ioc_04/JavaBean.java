package com.atguigu.ioc_04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaBean {
    @Value("二狗子")
    private String name;

    @Value("19")
    private int age;

    @Value("${jdbc.username:admin}")
    private  String username;
    @Value("${jdbc.password:passwd}")
    private String password;

    @Override
    public String toString() {
        return "JavaBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
