package com.library;

import com.library.book.BookList;
import com.library.user.Administrator;
import com.library.user.Ordinary;
import com.library.user.User;

import java.util.Scanner;

public class Main {
    public static User login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请确认您的身份：1 > 管理员  0 > 学生");
        int choice = sc.nextInt();
        if(choice == 1){
            return new Administrator(name);
        }else{
            return new Ordinary(name);
        }
    }
    public static void main(String[] args) {
        BookList bl = new BookList();
        //登录
        User user = login();
        //选择菜单
        while(true){
            int choice = user.menu();
            user.doOperation(choice,bl);
        }

    }
}
