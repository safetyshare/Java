package com.testone;

public class Main {
    static void main() {
    // 声明并创建对象，通过调用类中的方法，完成指定的功能
        // Circle c1 = new Circle(10);
        // System.out.println("面积: " + c1.area());
        // System.out.println("周长: " + c1.cl());
        // System.out.println("描述: " + c1.toString());
        // Calculator ac=new Calculator();
        // System.out.println(ac.Add2(6,8));
        // System.out.println(ac.Add3(2,4,9));
        // System.out.println(ac.AddDouble(3.4,6.7));
        System.out.println(ac.Add(6,8));
    }
}
class Calculator {
    public int Add(int a,int b){
        System.err.println(intint被调用);
        return a+b;
    }
    public int Add(int a,int b,int c){
        return a+b+c;
    }
    public double Add(double a,double b){
        return a+b;
    }
    public double Add(int a,double b){
        return (double)a+b;
    }
    
}
class Circle{
    private int r=6;
    public Circle(int r) {
        this.r = r;
    }
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