package com.atguigu;

import com.atguigu.ioc_01.XxxDao;
import com.atguigu.ioc_03.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void testIoC_01(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-01.xml");
        XxxDao bean = classPathXmlApplicationContext.getBean(XxxDao.class);
        System.out.println("bean = "+bean);
    }

    @Test
    public void testIoC_03(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-03.xml");
        UserController bean = classPathXmlApplicationContext.getBean(UserController.class);
        System.out.println("bean.show() = "+bean.show());
    }

}
