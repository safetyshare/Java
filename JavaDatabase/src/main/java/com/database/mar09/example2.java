package com.mar.nine;
public class example2 {
    public static void main(String[] args) {
        //类型转换
         int x;float y;double z;
         //没有转换
         x=3;y=2.5f;z=4.6;
         //自动类型转换
         z=3.4f;y=4;
         //强制类型转换
         y=(float)3.4;x=(int)4.6;
         System.out.println("x="+x+" y="+y+" z="+z);
         double r=x+y-z;
         System.out.println(r);
    }
}
