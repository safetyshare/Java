package com.advanced.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Date;

public class Test1 {
    static void main(){
        Person person=new Person("张三", "女", 15, new Date(2000-1900, 0, 1));
        person.getName();
        Class<Person> clazz=Person.class;
        Method method= null;
        try {
            method = clazz.getMethod("getName");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        Annotation[] annotations=method.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType().getName());
//            System.out.println(annotation.value());
        }

    }
}
