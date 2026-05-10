package com.advanced.password;
import java.util.Scanner;
public class Auth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        String username=sc.next();
        System.out.println("请输入密码");
        String password=sc.next();
        if (password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)\\S{6,16}$")){
            System.out.println("注册完成");
        } else {
            throw new UnSafePasswordException();
        }
    }
}
