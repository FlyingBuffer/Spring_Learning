package com.atguigu.book.service.impl;

import com.atguigu.book.dao.BookDao;
import com.atguigu.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao dao;
    /*
    * @Transactional：对方法中所有的操作作为一个事务进行管理
    * 在方法上使用只对方法有效果
    * 在类上使用，对类中所有的方法都有效果
    * @Transactional中可以设置的属性:
    * propagation:
    * isolation:
    * timeout:
    * readOnly:
    * rollbackFor|rollbackForClassName|noRollbackFor|noRollbackForClassName
    * */

    @Transactional
    public void buyBook(String bid, String uid) {
        Integer price = dao.selectPrice(bid);
        dao.updateSt(bid);
        dao.updateBalance(uid,price);
    }
}
