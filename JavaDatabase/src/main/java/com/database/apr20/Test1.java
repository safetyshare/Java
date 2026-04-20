package com.database.apr20;

public class Test1 {
    static void main(){
       new Myclass1();
    //    new Myclass2(); 
    }
}
class Myclass1{
    
}
abstract class Myclass2{

}
abstract class Aminal {
    private int w;
    public void eat(){
        System.out.println("会吃东西");
    }
    // 抽象方法，应该具备该功能，但现在又不知道怎么实现。
    public abstract void shout();
    // 抽象方法一定有抽象类，但抽象类不一定有抽象方法。
}
class Dog extends Aminal{
    public void shout(){
        System.out.println("汪汪汪汪");
    }
    public void protect(){
        System.out.println("看家");
    }
}
class Cat extends Aminal{
    public void shout(){
        System.out.println("喵喵喵");
    }
}