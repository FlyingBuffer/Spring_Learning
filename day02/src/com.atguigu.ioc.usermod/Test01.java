package com.atguigu.ioc.usermod;

import com.atguigu.ioc.usermod.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("user.xml");
        UserController uc= ac.getBean("userController", UserController.class);
        System.out.println(uc);


    }
}
