package com.database.apr24;

public class Test5 {
    @SuppressWarnings({ "unused", "deprecation" })
    public static void main(String[] args) {
        System.out.println("int的最大值："+Integer.MAX_VALUE);
        Integer i1=new Integer(10);
        Integer i2=new Integer("20");
        //Integer i3=new Integer("20re");//运行时会抛异常
        String s="100";
        int x=Integer.parseInt(s);
        System.out.println(x);
        double y=Double.parseDouble(s);
        System.out.println(y);
        System.out.println(Math.max(24.4, 45.5));
        System.out.println(Math.sqrt(100));
        System.err.println(Math.round((float)Math.random()));
        System.out.println(Math.pow(2, 11));
        System.out.println(Math.abs(-8));
    }
}
