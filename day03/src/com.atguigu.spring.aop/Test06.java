package com.atguigu.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("aop.xml");
        MathI math=ac.getBean("mathImpl",MathI.class);
        int i=math.div(1,0);
        System.out.println(i);
        /*TestHandler bean = ac.getBean("testHandler", TestHandler.class);
        bean.test();*/
    }
}
