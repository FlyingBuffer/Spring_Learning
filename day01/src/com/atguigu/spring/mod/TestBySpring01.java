package com.atguigu.spring.mod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBySpring {
    public static void main(String[] args) {
        //初始化容器(SSM中是自动的，不需要我们写的)
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过getBean()获取对象
        //Person person=(Person)ac.getBean("person");
        Person person = ac.getBean(Person.class);
        System.out.println(person);

    }
}
