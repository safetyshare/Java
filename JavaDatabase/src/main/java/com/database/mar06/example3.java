package com.database.mar06;

public class example3 {
    public static void main(String[] args) {
        System.out.println(3 +5);//结果8
        System.out.println("hello" +5);//结果 hello5
        System.out.println("hello"+ 3 + 5);//结果hello35
        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5.2%2);//浮点数是有存储误差的
        //两个整数可以求余，浮点数也可以求余运算。
        int x=5,y=7;
        int z;
        z=(x++)+y;//5+7=12
        System.out.println(z);
        x=5;z=++x+y;//x先自加变成6，6+7=13
        System.out.println(z);
        x=5;
        z=-x++;
        System.out.println(z);
    }
}
