package com.database.apr24;

public class Test1 {
    void main() {
        Object o1=new Object();
        System.out.println(o1.toString());
        Myclass1 mc1 = new Myclass1(10,20);
        System.out.println(mc1.toString());
        Myclass1 mc2 = new Myclass1(10,20);
        System.out.println(mc1.equals(mc2));//没有重写前：false Object类中的equal()比较的是对象的引用，而不是对象，需要重写equal()方法。
        System.out.println(mc1.equals(mc2));//重写之后 true
    }
}
class Myclass1{
    private int x;
    private int y;
    public Myclass1(){}
    public Myclass1(int x, int y){
        this.x=x;
        this.y=y;
    }
    public boolean equals(Myclass1 obj){
        if (this.x==obj.x && this.y==obj.y) {
            return true;
        }
        else{
            return false;
        }
    }
}