package com.atguigu;

import com.atguigu.ioc_01.XxxDao;
import com.atguigu.ioc_03.UserController;
import com.atguigu.ioc_04.JavaBean;
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

    @Test
    public void testIoC_04(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-04.xml");
        JavaBean bean = classPathXmlApplicationContext.getBean(JavaBean.class);
        System.out.println("bean.show() = "+bean);
    }

}
