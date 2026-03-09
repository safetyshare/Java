package com.mar.nine;
import java.util.Scanner;
public class example3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double chang,kuan,c,s;
        System.out.print("请输入长：");
        chang=sc.nextDouble();
        System.out.print("请输入宽：");
        kuan=sc.nextDouble();
        c=2*(chang+kuan);
        s=chang*kuan;
        System.out.println("周长为：" + c);
        System.out.println("面积为：" + s);

    }
}
