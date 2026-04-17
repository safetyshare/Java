package com.database.apr17;

public class Test4 {
    static void main(){
        int b=28;
        final int d=1;//final修饰的局部变量只能被赋值一次
        d=70;
        final int j;
    }
}
class Myclass1{
    int a=10;
    final int e=2;
    final int g;
    // final修饰的实例变量一定要明确赋值，并且只能赋值一次，
    // 可以在定义时赋值，也可以在构造方法中赋值。
    static int c=50;
    public final static int f=100;
    public final static int h;
    public final void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
    
}
class SubClass extends Myclass1{
    public void setA(int a) {
        this.a = a*a;
    }
    public int getA() {
        return a+100;
    }
}

// final修饰类：不能有子类
final class MyClass2{}

// class SubClass2 extends MyClass2{// 不能被继承，不能有子类
// }
// class Sub extends Math{}

