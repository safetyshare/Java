package com.mar.twenty;

public class example {
    static void main(){
        int i=1,sum=0;
        while (i<=100) {
            sum+=i;
            if (sum>=500) {
                break;
                 }
            i++;
            
        }
        System.out.println("x的最小值为："+i);
        i=100;sum=5050;
        while (i>=1) {
            sum-=i;
            if (sum<=500) {
                System.out.println(i);
                return;
                 }
            i--;
            
        }
    }
}
