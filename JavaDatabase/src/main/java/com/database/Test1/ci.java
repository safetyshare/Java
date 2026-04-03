package com.database.Test1;

public class ci {
    static void main(){
        Circle c1=new Circle(10);
        Circle c2=new Circle();
        System.out.println(c2.toString());
    }
}
class Circle{
    private int r=6;
    public Circle(int r) {
        this.r = r;
    }
    Circle(){}
    public double area() {
        return Math.PI * r * r;
    }
    public double cl(){
        return 2*Math.PI*r;
    }
    public String toString() {
        String s ="半径" +r;
        return s;
    }
}
