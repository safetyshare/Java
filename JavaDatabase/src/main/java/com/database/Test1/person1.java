package com.database.Test1;

public class person1 {
    static void main(){
        Person n1=new Person();
        Person n2=new Person("张三",'女',16);
        System.out.println(n1.toString());
        System.out.println(n2.toString());
    }
}
class Person{
    private String name;
    private char sex;
    private int age;
    Person(String name,char sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
        // this关键字，表示本类
    }
    Person(){}
    public String toString(){
        String s=("姓名："+name+"\n性别："+sex+"\n年龄"+age);
        return s;
    }
}
