package com.database.apr24;

public class Test2 {
    static void main(){
        String s1="zhangsan";
        String s2=new String("abc");
        byte[] b={65,66,67,68,69};//ABCDE
        String s3=new String(b);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s3.charAt(2));
        System.out.println(s2.concat("123"));//abc，s2本身并不会改变
        System.out.println("------------");
        String s="aBBcDDEf";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s);
        System.out.println("1111111111111111111111");
        String s4="abc 122 dd 334433";
        String[] arr=s4.split(" ");
        for (String a : arr) {
            System.out.println(a);
        }
        System.out.println(s.indexOf(' '));
        System.out.println(s1.equals("zhanger"));
        s1=new String("abc");
        s2=new String("abc");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("zhangsan"));
        s="hello";
        System.out.println(s.startsWith("he"));
        System.out.println(s.startsWith("hh"));
        System.out.println(s.endsWith("lo"));
        System.out.println(s.length());
        System.out.println(s.replace('l','L'));
    }
}
