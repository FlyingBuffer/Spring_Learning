package com.atguigu.ioc.usermod.controller;
import com.atguigu.ioc.usermod.service.UserService;
import com.atguigu.ioc.usermod.service.UserServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService=new UserServiceImpl();

    public void addUser(){
        userService.addUser();
    }
    public UserController(){
        System.out.println("UserController");
    }

}
