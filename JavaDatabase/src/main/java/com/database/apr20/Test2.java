package com.database.apr20;

public class Test2 {
    static void main(){
        Rect r=new Rect(2,3);
        System.out.println(r.toString());
        System.out.println(r.s());
        System.out.println(r.cl());
    }
}
abstract class Tshape{
    protected double l;
    
    @Override
    public String toString() {
        return "maths [l=" + l + "]";
    }
    public abstract double cl();
    public abstract double s();
}
class Circle extends Tshape{
    public double cl(){
        return Math.PI*2*l;
    }
    public double s(){
        return Math.PI*l*l;
    }
    public Circle(double r){
        this.l=r;
    }
}
class Rect extends Tshape{
    double w;
    
    @Override
    public String toString() {
        return super.toString()+"长：" + l + ", 宽" + w;
    }
    public double cl(){
        return 2*(l+w);
    }
    public double s(){
        return l*w;
    }
    public Rect(double l, double w){
        this.l=l;
        this.w=w;
    }
}