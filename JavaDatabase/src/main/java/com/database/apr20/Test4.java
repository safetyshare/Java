package com.database.apr20;

public class Test4 {
    static void main(){
        Person p1=new Person();
        jianbing b1=new LiJia();
        p1.zaocan(b1);
    }
}
interface jianbing {
    void jiankang();
    void weiisheng();
    String getDianPu();    
}
class LiJia implements jianbing{
    private String dp="李家煎饼";
    public void jiankang(){
        System.out.println("勤体检");
    }
    public void weiisheng(){
        System.out.println("勤打扫");
    }
    public String getDianPu(){
        return dp;
    }
    public void cuxiao(){
        System.out.println("卖煎饼送豆浆");
    }
}

class zhangjia implements jianbing{
    private String dp="张家煎饼";
    public void jiankang(){
        System.out.println("坚持锻炼");
    }
    public void weiisheng(){
        System.out.println("坚持消毒");
    }
    public String getDianPu(){
        return dp;
    }
}
class Person{
    private String name="张三";
    public void zaocan(jianbing b){
        System.out.println(name+"的早餐是"+b.getDianPu()+"家的煎饼");
    }
}