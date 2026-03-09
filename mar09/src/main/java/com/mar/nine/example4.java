package com.mar.nine;
import java.util.Scanner;
public class example4 {
    public static void main(String[] args) {
        double r,c,s;
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入圆的半径：");
        r=sc.nextDouble();
        //Math Math.PI
        c=2*Math.PI*r;
        s=Math.PI*r*r;
        System.out.println("周长为："+c);
        System.out.println("面积为："+s);
        //开平方根
        double z=Math.sqrt(s);
    }
}
