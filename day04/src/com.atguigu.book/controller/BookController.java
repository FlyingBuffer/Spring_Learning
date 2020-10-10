package com.atguigu.book.controller;

import com.atguigu.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService service;
    public void buyBook(){
        service.buyBook("1","10010");
    }

}
