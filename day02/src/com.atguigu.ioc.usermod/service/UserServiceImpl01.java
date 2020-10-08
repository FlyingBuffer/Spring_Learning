package com.atguigu.ioc.usermod.service;

import com.atguigu.ioc.usermod.dao.UserDao;
import com.atguigu.ioc.usermod.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public void addUser() {
        userDao.addUser();

    }

    public UserServiceImpl(){
        System.out.println("UserServiceImpl");
    }
}
