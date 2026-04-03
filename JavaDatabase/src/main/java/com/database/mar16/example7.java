package com.database.mar16;

public class example7 {
    public static void main(String[] args) {
        int i=200,sum=0;
        while (i<=800)
        {
            if(i%7==0||i%9==0) {
                sum+=i;
                i++;
            }
            else {
                i++;
                continue;
            }
        }
        System.out.println("结果为："+sum);
    }
}
