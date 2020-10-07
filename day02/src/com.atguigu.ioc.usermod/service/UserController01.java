package com.atguigu.ioc.usermod.service;

import com.atguigu.ioc.usermod.dao.UserDao;
import com.atguigu.ioc.usermod.dao.UserDaoImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao=new UserDaoImpl();
    @Override
    public void addUser() {
        userDao.addUser();

    }

    public UserServiceImpl(){
        System.out.println("UserServiceImpl");
    }
}
