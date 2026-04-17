package com.database.apr13;

public class duotai {
    static void main(){
    Animal1 an1,an2,an3;
    an1=new Animal1();
    an1.shout();
    an2=new Dog();
    an2.shout();
    an3=new Cat();
    an3.shout();
    Dog d=(Dog) an2;
    Cat c=(Cat) an3;

    }
}
class Animal1{
    public void shout(){
        System.out.println("动物要叫");
    }
}
class Dog extends Animal1{
    public void shout(){
        System.out.println("汪汪汪");
    }
}
class Cat extends Animal1{
    public void shout(){
        System.out.println("喵喵喵");
    }
}