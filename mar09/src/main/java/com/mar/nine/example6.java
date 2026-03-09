package com.mar.nine;
import java.util.Scanner;
public class example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int a=sc.nextInt();
        if((a%3==0)&&(a%7!=0)){
            System.out.println("满足要求");
        }
        else {
            System.out.println("不满足要求");
        }
    }
}
