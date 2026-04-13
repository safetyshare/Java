package com.database.apr10;

class Bird {
    // Bird类的fly()方法
    public void fly() {
        System.out.println("我在飞");
    }
}
class Ostrich extends Bird {
    // 重写父类的fly()方法
    public void fly() {
        System.out.println("我只能在地上奔跑");
    }
}
public class Test6 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly(); // 输出：我在飞

        Bird ostrich = new Ostrich();
        ostrich.fly(); // 输出：我不会飞（体现重写效果）
    }
}