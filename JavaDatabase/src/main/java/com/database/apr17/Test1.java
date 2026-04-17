package com.database.apr17;

public class Test1 {
    static void main(){
        Person p1=new Person("张三",23);
        Person p2=new Person("张三",23);
        //通过对象访问：对象名.类变量名
        System.out.println(p1.num);
        System.out.println(p2.num);
        //通过类访问：类名.类变量名（常用的访问方法）
        System.out.println(Person.num);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        Person.printNum();
    }
}
class Person{
    private String name;
    private int age;//实例变量：每个对象在内存中都有自己的一份拷贝
    static int num=0;//类变量：内存中只有一份拷贝，所有对象共享同一个变量

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        num++;
    }

    @Override
    public String toString() {//非static方法，通过对象进行调用
        return "姓名：" + name + "\n年龄：" + age;
    }
    public static void printNum(){
        System.out.println("人类总数："+num);
        // System.out.println(name);//static方法中不能访问static成员
    }
}