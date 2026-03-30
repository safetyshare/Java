package com.mar.thirty;

public class Test2 {
    static void main(){
        Box box=new Box();
        box.toString();
    }
}
class Box{
    private int length;
    private int width;
    private int height;
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
        System.out.println(vs);
        System.out.println(ss);
        return vs+"\n"+ss;
    }
}