package com.database.apr24;
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,s=0;
        long ms;
        System.out.println("inout x:");
        x=sc.nextInt();
        if (x==1) {
            System.exit(0);            
        }else{
            System.out.println("程序继续执行");
            System.out.println("程序继续执行");
            System.out.println("程序继续执行");
            ms=System.currentTimeMillis();
            long ms1,ms2;
            ms1=System.currentTimeMillis();
            System.out.println(ms);
            for (int i = 0; i < 100000; i++) {
                s+=i-29999;
            }
            ms2=System.currentTimeMillis();
            System.out.println("循环花费的时间："+(ms2-ms1));
        }sc.close();
        
    }
}
