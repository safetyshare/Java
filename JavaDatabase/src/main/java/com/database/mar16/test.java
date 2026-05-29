package com.database.mar16;
import java.util.Scanner;
public class test {
    static void main(){
        double x;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入x的值：");
        x=sc.nextDouble();
        if (x<=1)
        {
            System.out.println("y的值为："+x);
        }
        else if(x>=1&&x<10)
        {
            System.out.println("y的值为："+(2*x-1));
        }
        else if(x>=10)
        {
            System.out.println("y的值为："+(3*x-11));
        }sc.close();
    }
}
