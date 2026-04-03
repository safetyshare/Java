package com.database.mar20;
public class example6 {
    static void main(){
        int a=1,i=1;long sum1=1,sum2=0;
        while(a<=20){
            while(i<=a){
                sum1*=i;
                i++;
            }
            System.out.println(a+"的阶乘为："+sum1);
            sum2+=sum1;
            sum1=1;
            a++;
            i=1;
            }
        
        System.out.println("1!+2!+...+20!的和为："+sum2);
    }
}
