package com.library.operation;


import com.library.book.BookList;

public class ExiOperation implements IOperation{
    @Override
    public void work(BookList bl) {
        System.out.println("退出系统");
        System.exit(0);
    }
}