package com.advanced.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test {
    static void main() throws NoSuchMethodException {
        Class<AnnotatedClass> clazz=AnnotatedClass.class;
        Method method=clazz.getMethod("Method1");
        MyAnnotation annotation=method.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
        System.out.println(annotation.month());
    }
    
}
class AnnotatedClass {
    @MyAnnotation(value = "1.1",month = Month.Jan, week=Week.Thu)
    public static void Method1(){
        System.out.println("你正在调用方法");
    }
}