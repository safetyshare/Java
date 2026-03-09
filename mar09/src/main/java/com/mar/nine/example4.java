package com.mar.nine;
import java.util.Scanner;
public class example4 {
    public static void main(String[] args) {
        double r,c,s;
        double pi=3.14;
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入圆的半径：");
        r=sc.nextDouble();
        c=2*pi*r;
        s=pi*r*r;
        System.out.println("周长为："+c);
        System.out.println("面积为："+s);
    }
}
