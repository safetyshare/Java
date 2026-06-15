package com.advanced.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test {
    static void main() {
        Method();
        Annotation[] annotation=Method.class.getAnnotations();
        for (Annotation annotation1 : annotation) {
            System.out.println(annotation1.annotationType().getName());
        }
    }
    @MyAnnotation(value = "1.1",month = Month.Jan, week=Week.Thu)
    public static void Method(){
        System.out.println("你正在调用方法");

    }
}
