package com.library.book;

public class BookList {

    private Book[] books;
    private int size;


    public BookList() {
        this.books = new Book[10];
        books[0] = new Book("高邮的鸭蛋","汪曾祺",10,"小说",1);
        books[1] = new Book("长恨歌","白居易",23,"诗",3);
        books[2] = new Book("野草","鲁迅",20,"小说",2);
        this.size = 3;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setBooks(int pos, Book book) {
        this.books[pos] = book;
    }

    public Book getBook(int pos) {
        return this.books[pos];
    }
}
