package com.atguigu.ioc.usermod;

import com.atguigu.ioc.usermod.controller.UserController;
import com.atguigu.ioc.usermod.dao.UserDao;
import com.atguigu.ioc.usermod.dao.UserDaoImpl;
import com.atguigu.ioc.usermod.service.UserService;
import com.atguigu.ioc.usermod.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("user.xml");
        UserController uc= ac.getBean("userController", UserController.class);
        System.out.println(uc);
        UserServiceImpl us = ac.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(us);
        UserDao ud = ac.getBean("userDaoImpl", UserDaoImpl.class);
        System.out.println(ud);



    }
}
