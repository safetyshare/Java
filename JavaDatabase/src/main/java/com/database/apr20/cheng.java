package com.database.apr20;

public class cheng implements Innercheng{
    static void main(){
        cheng c=new cheng();
        System.out.println(c.factorial(5));
        System.out.println(c.myPower(2, 3));
        System.out.println(c.findFactorSum(4, 12));
        
    }
    public long factorial(int m){
        int sum=1;
        for(;m>0;m--){
            sum*=m;
        }
        return (long)sum;
    }
    public long myPower(int m,int n){
        return (long) Math.pow(m, n);
    }
    public boolean findFactorSum(int m,int n){
        if (m>0){
            return m%n==0;
        }
        else{
            return n % m == 0;}
    }
}

interface Innercheng {
    long factorial(int m); //求参数的阶乘 
    long myPower(int m,int n);    //求参数m的n次方 
    boolean findFactorSum(int m,int n);  //判断参数中较小数是否是较大数的因子
    
}

