package com.atguigu.ioc.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SystemPropertyUtils;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("life.xml");
        Person person = ac.getBean("person", Person.class);
        System.out.println(person);

    }
}

