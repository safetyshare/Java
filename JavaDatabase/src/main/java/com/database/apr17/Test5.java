package com.database.apr17;

public class Test5 {
    static void main(){
        /*Myclass mc1=new Myclass();
        System.out.println(mc1.toString());
        System.out.println("-----------------");
        Myclass mc2=new Myclass(1,2);
        System.out.println(mc2.toString());*/
        new Sub();
        System.out.println("________________");
        new Sub();
    }
}
class Myclass{
    private int x=10;
    private int y=20;
    static int z=0;
    public Myclass(){
        System.out.println("无参构造方法");
    }
    public Myclass(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("有参构造方法");

    } 
    {
        x=100;y=200;
        System.out.println("第一个初始化块");
    }
    {
        x=1000;
        y=2000;
        System.out.println("第二个初始化块");
        
    }
    @Override
    public String toString() {
        return "Myclass [x=" + x + ", y=" + y + "]";
    }
    // 静态初始化块
    static{
        z=10;
        // x=1;// 错误，静态初始化块只能访问static变量
        // y=2;
        System.out.println("静态初始化块被执行");
    }
}
/*1.先执行初始化块，再执行构造方法
2.有多个初始化块时，按照书写顺序执行
3.静态初始化块优先于非静态初始化块时执行
4.静态初始化块只在类初始化块时被执行一次，不管创建多少对象都只执行一次
5.有继承情况下，先执行父类及子类的静态初始化块，并且执行一次
6.有继承情况下，先执行父类（包括初始化块和构造方法），再执行子类
*/
class Sub extends Myclass{
    public Sub() {
        System.out.println("子类构造方法");
    }
    static {
        System.out.println("子类静态初始化块");
    }
    {
        System.out.println("子类非静态初始化块");
    }
}
