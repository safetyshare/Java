package com.database.apr13;

public class Test1 {
    static void main(){
        MyClass m1=new MyClass();
        m1.func1();
        SubClass1 s1=new SubClass1();
        s1.func1();
        s1.func2();
        System.out.println(s1.toString());
        Bird b1=new Bird();
        b1.fly();
        OSstich o1=new OSstich();
        o1.fly();
    }
}
class Bird {
    public void fly(){
        System.out.println("我在飞");
    }
}
class OSstich extends Bird{
    public void fly(){
        System.out.println("我不会飞，只能在地上跑");
    }
}
class MyClass{
    //未指定父类，父类为Object类
    private int x=10;
    protected int y=20;
    public int z=30;
    public void func1(){
        System.out.println("父类的func1方法");
    }
    @Override
    public String toString() {
        String s;
        s="MyClass [x=" + x + ", y=" + y + ", z=" + z + "]";
        return s;
    }
    
}
class SubClass1 extends MyClass{
    private int a=200;
    public void func2(){
        System.out.println("子类的func2方法");
    }
    //重写父类方法（改造）：从父类继承的方法不适用于子类，这时就需要改造从父类继承的方法
    //子类的tostring()方法：把继承的属性和新增的属性都以字符串的形式返回
    //子类中的同名方法必须与父类方法的方法首部完全相同
    public String toString(){
        //先调用父类的toString方法，然后在添加子类的属性
        //调用父类同名方法super关键字
        String s=super.toString();
        s+="\na："+a;
        return s;
    }
}