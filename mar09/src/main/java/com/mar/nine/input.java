package com.mar.nine;
import java.util.Scanner;//引入Scanner类
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;double y;
        System.out.print("请输入一个整数:");
        x=sc.nextInt();//调用相应的方法输入
        System.out.println("x="+x);
        System.out.print("请输入一个小数:");
        y=sc.nextDouble();
        System.out.println("y="+y);
    }
}
