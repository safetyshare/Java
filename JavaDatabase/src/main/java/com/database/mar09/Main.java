package com.database.mar09;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //逻辑运算符
        boolean result;
        int x,y,z;
        x=6;y=10;z=12;
        result=!(x>y);//true
        System.out.println("result="+result);
        result=(x>y)^(y<z);//true
        System.out.println("result="+result);
        result=(x>y)&&(y<z);//false
        System.out.println("result="+result);
        result=(x>y)&(y<z);//false
        System.out.println("result="+result);
        result=(x>y)||(y<z);//true
        System.out.println("result="+result);
        result=(x>y)|(y<z);//true
        System.out.println("result="+result);

        result=(x>y)&&(y++<z);//当第一个表达式的值为false时，后面的表达式不会被执行。
        System.out.println("result="+result +" y="+y);
        y=10;
        result=(x>y)&(y++<z);
        System.out.println("result="+result +" y="+y);
        //逻辑或或短路或
        x=5;y=3;z=10;
        result=(x>y)||(y++<z);
        System.out.println("result="+result +" y="+y);
        //条件运算符
        x=6;y=10;
        System.out.println(x>y?true:false);
    }
}