package com.database.mar30;

public class Test1 {
    static void main(){
        // Rect rect=new Rect();
        // rect.area();
        Person p1;//声明对象
        p1 = new Person();//创建对象。只针对成员变量进行内存分配。
        p1.think();
        p1.say();//通过对象完成相应的功能
        Rect re1=new Rect(2,3);
        System.out.println(re1.clength());
        System.out.println(re1.area());
        Rect re2=new Rect(10,20);
        System.out.println(re2.clength());
        System.out.println(re2.area());
        Yuan y1=new Yuan(5);
        System.out.println(y1.clength());
        System.out.println(y1.area());
        Yuan y2=new Yuan(10);
        System.out.println(y2.clength());
        System.out.println(y2.area());
    }
}
//人类
class Person {
    //成员变量：静态属性和特征
    String name; //姓名
    int h;//身高
    int w;//体重
    //成员方法：描述对象，具备的功能，能干什么，
    public void think(){
        System.out.println("人会思考！！");
    }
    public void say(){
        System.out.println("人会说话！");
    }
}
class Rect {
    private int length1=4;//长
    private int weight=8;
    //构造方法
    public Rect(int l,int w){
        length1=l;
        weight=w;
    }
    //成员方法
    //求周长
    public int clength(){
        int cl;
        cl =2*(length1+weight);
        return cl;
    }
    public int area(){
        int s;
        s=(length1*weight);
        return s;
    }
}
class Yuan {
    private int r;//半径
    public Yuan(int r1){
        r=r1;
    }
    public double clength(){
        double cl;
        cl=2*Math.PI*r;
        return cl;
    }
    public double area(){
        double s;
        s=Math.PI*r*r;
        return s;
    }
}