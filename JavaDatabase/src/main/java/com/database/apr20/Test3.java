package com.database.apr20;

public class Test3 {
    Rect1 r=new Rect1();
}
interface TShape {
    public abstract double area();
    double cl();
    String toString1();

}
class Rect1 implements TShape{
    private double l=6,w=7;
    public double cl(){
        return 2*(l+w);
    }
    public double area(){
        return l*w;
    }
    public String toString1(){
        return "长：" + l + "\t宽" + w;
    }

}