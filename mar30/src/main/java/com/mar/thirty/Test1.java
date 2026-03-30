package com.mar.thirty;

public class Test1 {
    static void mian(){

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
    private int length1;//长
    private int weight;
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