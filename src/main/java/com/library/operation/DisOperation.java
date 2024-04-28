package com.library.operation;


import com.library.book.Book;
import com.library.book.BookList;

public class DisOperation implements IOperation{
    @Override
    public void work(BookList bl) {
        System.out.println("显示图书");
        for (int i = 0; i < bl.getSize(); i++) {
            Book book = bl.getBook(i);
            System.out.println(book);
        }
    }
}