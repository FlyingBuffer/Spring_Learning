package com.atguigu.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-di.xml");
        Student s1= ac.getBean("s1", Student.class);
        System.out.println(s1);
        Student s2= ac.getBean("s2", Student.class);
        System.out.println(s2);
    }

}
