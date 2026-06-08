package com.advanced.reflection;

import java.lang.reflect.Method;

public class reflectInvoke {
    static void main() throws Exception{
        Class claze = Class.forName("com.advanced.reflection.Product");
        Product pro=(Product) claze.newInstance();
        Method med1 =claze.getDeclaredMethod("setString", long.class, String.class);
        Object returnvalue=med1.invoke(pro,23,"AA");
        System.out.println(returnvalue);
        Method med2=claze.getDeclaredMethod("getid");
        med2.setAccessible(true);
        med2.invoke(pro);
    }
}
