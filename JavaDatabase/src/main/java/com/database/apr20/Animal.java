package com.database.apr20;

public class Animal {
    private String type;
    public Animal(String type){
        this.type=type;
    }
    public String toString(){
        return "动物类型: " + type;
    }
    public void sound(){
        System.out.println("叫声");
    }
}
interface Flyable {
    double flySpeed();
}
class Glede extends Animal implements Flyable{
    public Glede(){
        super("老鹰");
    }
    public void sound(){
        System.out.println("老鹰叫");
    }
    public double flySpeed(){
        return 2.0;
    }
}
class Pigeon extends Animal implements Flyable{
    public Pigeon(){
        super("鸽子");
    }
    public void sound(){
        System.out.println("鸽子叫");
    }
    public double flySpeed(){
        return 1.0;
    }
}
// 编写测试类，打印输出老鹰和鸽子的叫声信息和最大飞行速度
class Test5{
    static void main(){
        Glede g=new Glede();
        g.sound();
        System.out.println("老鹰的飞行速度是: " + g.flySpeed() + " km/h");
        Pigeon p=new Pigeon();
        p.sound();
        System.out.println("鸽子的飞行速度是: " + p.flySpeed() + " km/h");
    }
}