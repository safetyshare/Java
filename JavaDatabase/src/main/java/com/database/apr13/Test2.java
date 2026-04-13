package com.database.apr13;

public class Test2 {
    static void main(){
        System.out.println("创建不带参数的子类对象");
        SubClass sc1=new SubClass();
        System.out.println("\n创建带一个参数的子类对象");
        SubClass sc2=new SubClass(3);
        System.out.println("\n创建带有两个参数的子类对象");
        SubClass sc3=new SubClass(23,6);
    }
}
class Base{
    private int x;
    public Base(){
        System.out.println("父类不带参数的构造方法");
    }
    public Base(int x){
        this.x=x;
        System.out.println("父类带一个参数的构造方法");
    }
}
class SubClass extends Base{
    private int a;
    public SubClass(){
        System.out.println("子类不带参数的构造方法");
    }
    public SubClass(int a){
        this.a=a;
        System.out.println("子类带一个参数的构造方法");
    }
    public SubClass(int x,int a){
        // super.x=x;是错误的，x是父类的私有成员
        super(x);//调用父类的构造方法
        this.a=a;
        System.out.println("子类带有两个参数的构造方法");
    }
}
//继承中的构造方法
// 1.创建子类对象时，一定会调用父类的构造方法，默认情况下，会调用父类的不带参数的构造方法
// 2.调用顺序，先调用父类的构造方法，再调用子类的构造方法
// 3.显式调用了父类的构造方法，将不再调用父类不带参数的构造方法