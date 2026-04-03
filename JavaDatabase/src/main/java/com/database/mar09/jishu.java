package com.database.mar09;
import java.util.Scanner;
public class jishu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mun;
        System.out.print("请输入一个整数");
        mun=sc.nextInt();
        if(mun%2==1){
            System.out.println("该数为奇数");
        }
        else {
            System.out.println("该数为偶数");
        }

    }
}
