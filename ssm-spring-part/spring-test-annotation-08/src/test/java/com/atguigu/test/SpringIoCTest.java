package com.atguigu.test;

import com.atguigu.components.A;
import com.atguigu.config.JavaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = JavaConfig.class)
public class SpringIoCTest {
    @Autowired
    private A a;
    @Test
    public void test(){
        System.out.println("A = "+a);
    }
}
