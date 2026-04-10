package com.database.apr10;

public class Test5 {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();
        d1.say();
        System.exit(0);
        Student1 s1=new Student1();
        s1.study();
        s1.speak();
        s1.think();
        
    }
}
class Animal{
    public double weight;
    public void eat(){
        System.out.println("动物在吃东西");
    }
}
class Dog extends Animal{
    public void say(){
        System.out.println("狗叫：汪汪汪");
    }
}
class Person{
    private String Name;
    private int h;
    public void speak(){
        System.out.println("人有语言会说话");
    }
    public void think(){
        System.out.println("人会思考");
    }
}
class Student1 extends Person{
    private String no;
    private int score;
    public void study(){
        System.out.println("学生的主要任务是学习！！");
    }
}