package com.library.user;

import com.library.book.BookList;
import com.library.operation.IOperation;

//抽象类，主要为了被继承
public abstract class User {
    public String name;
    public IOperation[] operation;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bl) {
        this.operation[choice].work(bl);
    }
}