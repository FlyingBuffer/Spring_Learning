package com.atguigu.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-di.xml");
        Student student = ac.getBean("s1", Student.class);
        System.out.println(student);
    }

}
