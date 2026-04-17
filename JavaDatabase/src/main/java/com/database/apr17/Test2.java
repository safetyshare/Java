package com.database.apr17;

public class Test2 {
    static void main(){
        CoLtd c1=new CoLtd("红色","A");
        CoLtd c2=new CoLtd("蓝色","B");
        System.out.println(CoLtd.num);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        c1.out();
        System.out.println(c1.toString());
        System.out.println(CoLtd.num);
    }
}
class CoLtd{
    private String Color;
    private String Model;
    static int num=0;
    public CoLtd(String color, String model) {
        Color = color;
        Model = model;
        num++;
    }
    public CoLtd() {
        Color = "红色";
        Model = "L";
        num++;
}
    public void out(){
        num--;
        Color=null;
        Model=null;
    }
    @Override
    public String toString() {
        return "颜色：" + Color + "\t型号：" + Model;
    }
}