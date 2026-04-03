package com.database.mar30;

public class Test2 {
    static void main(){
        Box box1=new Box(3,4,6);
        System.out.println("体积是："+box1.v());
        System.out.println("表面积是："+box1.s());
        System.out.println(box1.toString());
        Box box2=new Box(5,7,8);
        System.out.println("体积是："+box2.v());
        System.out.println("表面积是："+box2.s());
        System.out.println(box2.toString());
    }
}
class Box{
    private int length;
    private int width;
    private int height;
    public Box(int a,int b,int h){
        length=a;
        width=b;
        height=h;
    }
    public int v(){
        int v;
        v=length*width*height;
        return v;
    }
    public int s(){
        int s;
        s=2*(length*width+length*height+width*height);
        return s;
    }
    public String toString(){
        String vs="体积为："+v();
        String ss="表面积为："+s();
//        System.out.println(vs);
//        System.out.println(ss);
        return vs+"\t"+ss;
    }
}