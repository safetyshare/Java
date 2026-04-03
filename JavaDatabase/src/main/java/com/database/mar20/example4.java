package com.mar.twenty;
import java.util.Scanner;
public class example4 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int a;int sum=0;
        while(true){
            System.out.println("请输入一个整数，输入0结束：");
            a=sc.nextInt();
            if (a==0) {
                break;
            }
            else if (a<0) {
                continue;                
            }
            else{
                sum+=a;
            }
        }
        System.out.println("输入的正数的和为："+sum);
    }
}
