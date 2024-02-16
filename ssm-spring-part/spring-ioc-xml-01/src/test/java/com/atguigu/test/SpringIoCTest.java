package com.atguigu.test;

import com.atguigu.ioc_03.HappyComponent;
//import com.atguigu.ioc_04.JavaBean;
import com.atguigu.ioc_05.JavaBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCTest {
    /**
     * 创建IoC
     */
    public void createIoC(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-03.xml");

        ClassPathXmlApplicationContext classPathXmlApplicationContext1 = new ClassPathXmlApplicationContext();
        classPathXmlApplicationContext1.setConfigLocation("spring-03.xml");
        classPathXmlApplicationContext1.refresh();
    }
    @Test
    public void getBeanFromIoC(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext1 = new ClassPathXmlApplicationContext();
        classPathXmlApplicationContext1.setConfigLocation("spring-03.xml");
        classPathXmlApplicationContext1.refresh();

        HappyComponent happyComponent3 = (HappyComponent)classPathXmlApplicationContext1.getBean("happyComponent");
        HappyComponent happyComponent = classPathXmlApplicationContext1.getBean("happyComponent", HappyComponent.class);
        HappyComponent happyComponent1 = classPathXmlApplicationContext1.getBean(HappyComponent.class);

        System.out.println(happyComponent3 == happyComponent);
        System.out.println(happyComponent1 == happyComponent);

    }

    @Test
    public void test_04(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext1 = new ClassPathXmlApplicationContext();
        classPathXmlApplicationContext1.setConfigLocation("spring-04.xml");
        classPathXmlApplicationContext1.refresh();

        JavaBean bean = classPathXmlApplicationContext1.getBean(JavaBean.class);
        classPathXmlApplicationContext1.close();
    }

    @Test
    public void test_05(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext1 = new ClassPathXmlApplicationContext();
        classPathXmlApplicationContext1.setConfigLocation("spring-05.xml");
        classPathXmlApplicationContext1.refresh();

        JavaBean bean = classPathXmlApplicationContext1.getBean(JavaBean.class);
        System.out.println("javabean:"+bean);
        Object beanFac = classPathXmlApplicationContext1.getBean("&javaBean");
        System.out.println("javabeanFac:"+beanFac);
        classPathXmlApplicationContext1.close();
    }
}
