package com.database.apr13;

class Creature{
    public Creature(){
        System.out.println("Creature无参数的构造方法");
    }
}
class Animal extends Creature{
    public Animal(String name){
        System.out.println("带一个参数的构造方法，该动物的那么为"+name);
    }
    public Animal(String name,int age){
        this(name);
        System.out.println("Animal带有两个参数的构造方法，年龄为"+age);
    }
}
class Wolf extends Animal{
    public Wolf(){
        super("狼",6);
        System.out.println("Wolf无参数的构造方法");
    }
}
public class Wolf2 {
    public static void main(String[] args) {
        Wolf w=new Wolf();
    }
}