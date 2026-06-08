package com.advanced.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class reflections {
    static void main() throws Exception {
        Class clazz = Class.forName("java.lang.System");
//        printf(clazz);
//        printSuperClass(clazz);
//        printInterface(clazz);
//        printConstructor(clazz);
//        printDeclaredConstructor(clazz);
        printMethods(clazz);
    }

    public static void printInterface(Class clazz) {
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces.length > 0) {
            System.out.println("实现了以下接口");
        }
        for (Class class1 : interfaces) {
            System.out.println(class1);
        }

    }

    public static void printConstructor(Class clazz) {
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
            String name = constructor.getName();
            String modifier = Modifier.toString(constructor.getModifiers());
            System.out.println(modifier + "++" + name);
            Class[] parameter = constructor.getParameterTypes();
            for (int i = 0; i < constructors.length; i++) {
                System.out.println(",");
                if (parameter[i].isArray()) {
                    System.out.println(parameter[i].getComponentType().getName() + "[]");

                } else {
                    System.out.println(parameter[i].getComponentType().getName());
                }

            }

        }
    }

    public static void printf(Class clazz) {
        System.out.println("类名：" + clazz);
        String packageN = clazz.getPackage().getName();
        System.out.println("包名：" + packageN);
        String modifiers = Modifier.toString(clazz.getModifiers());
        System.out.println("修饰符：" + modifiers);
        String fullname = clazz.getName();
        System.out.println("类全名：" + fullname);
//        System.out.println(clazz.get);
    }

    public static void printSuperClass(Class clazz) {
        Class superclass = clazz.getSuperclass();
        if (superclass != null && !superclass.equals(Object.class)) {
            System.out.println(superclass);
        } else if (superclass.equals(Object.class)) {
            System.err.println(superclass);

        } else {
            System.err.println("无");
        }

    }

    public static void printDeclaredConstructor(Class clazz) {
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            String name = constructor.getName();
            String modifier = Modifier.toString(constructor.getModifiers());
            System.out.println(modifier + "\t" + name);
            Class[] parameter = constructor.getParameterTypes();
            for (int i = 0; i < constructor.getParameterTypes().length; i++) {
                System.out.print(",");
                if (parameter[i].isArray()) {
                    System.out.println(parameter[i].getComponentType().getName() + "[]");

                } else {
                    System.out.print(parameter[i].getComponentType().getName());
                }
                System.out.println();
            }

        }
    }

    public static void printMethods(Class clazz) {
        Method[] constructors = clazz.getDeclaredMethods();
        for (Method constructor : constructors) {
            String name = constructor.getName();
            String modifier = Modifier.toString(constructor.getModifiers());
            Class returntype=constructor.getReturnType();
            System.out.println(modifier + "\t" + name);
            System.out.println("return:"+returntype);
            Class[] parameter = constructor.getParameterTypes();
            for (int i = 0; i < constructor.getParameterTypes().length; i++) {
//                System.out.print(",");
                if (parameter[i].isArray()) {
                    System.out.print(parameter[i].getComponentType().getName() + "[]");

                } else {
                    System.out.print(parameter[i].getName());
                }
                System.out.println(",");
            }
        }

    }
}