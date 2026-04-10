package com.database.apr10;

public class Test1 {
    static void main(){
        Rect r1=new Rect();
        Rect r2=new Rect(5, 10);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        // r2.l=1; 错误，l是类的私有成员
        // r2.w=6;
        r2.setL(1);
        r2.setW(6);
        System.out.println(r2.toString());
    }
}
class Rect{
    private int l=3;
    private int w=5;
    public Rect(){

    } 
    public Rect(int l,int w){
        this.l=l;
        this.w=w;
    }
    public int area(){
        return l*w;
    }
    public int clenth(){
        return 2*(l+w);
    }
    public String toString(){
        String s="长："+l+"\t宽："+w;;
        return s;
    }
    public void setL(int l) {
        this.l = l;
    }
    public void setW(int w) {
        this.w = w;
    }
    public int getL() {
        return l;
    }
    public int getW() {
        return w;
    }
    
}