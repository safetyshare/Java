package com.database.apr24;

public class Test3 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("hello");
        StringBuffer s2= new StringBuffer("world!");
        System.out.println(s1.append(" world"));
        System.out.println("s1: "+s1);
        StringBuffer s3=new StringBuffer("passwd");
        System.out.println(s3.insert(4, "or"));//将passwd修改为password
        System.out.println(s3.reverse());//反转s4
        StringBuffer s4=new StringBuffer("fastboot ");
        s4.setCharAt(s4.length()-1, 'd');System.out.println(s4);//将最后一个空格修改为d，fastbootd（用户空间fastboot）
        System.err.println(s4.lastIndexOf("o"));
    }
}
