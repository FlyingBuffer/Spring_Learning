package com.atguigu.book.service.impl;

import com.atguigu.book.dao.BookDao;
import com.atguigu.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
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
    * propagation:A和B方法都有事务，当A在调用B时，会将A中的事务传播给B方法，B方法对于事务的处理方式就是事务的传播行为
    * Propagation.REQUIRED:必须使用调用者的事务
    * isolation:
    * timeout:
    * readOnly:
    * rollbackFor|rollbackForClassName|noRollbackFor|noRollbackForClassName
    * */

    @Transactional(propagation = Propagation.REQUIRED)
    public void buyBook(String bid, String uid) {
        Integer price = dao.selectPrice(bid);
        dao.updateSt(bid);
        dao.updateBalance(uid,price);
    }
}
