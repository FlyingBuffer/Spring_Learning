package com.atguigu.book;

import com.atguigu.book.controller.BookController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("book.xml");
        BookController controller = ac.getBean("bookController", BookController.class);
        //controller.buyBook();
        controller.CheckOut();
    }
}
