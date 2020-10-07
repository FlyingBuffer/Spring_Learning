package com.atguigu.ioc.usermod.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    public UserServiceImpl(){
        System.out.println("UserServiceImpl");
    }
}
