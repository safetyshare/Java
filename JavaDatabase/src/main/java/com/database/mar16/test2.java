package com.mar.sixteen;
import java.util.Scanner;
public class test2 {
    static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入a的值");
        int b=sc.nextInt();
        int a=b;
        System.out.println("请输入n的值");
        int n=sc.nextInt();
        int sum=0;
        if (a>=1&&a<=9) {
            while (n>=1){
            sum+=a;
            a=a*10+b;
            n--;
            }
            System.out.println("结果为："+sum);
        }
        else{
            System.out.println("错误");
        }
    }
}
