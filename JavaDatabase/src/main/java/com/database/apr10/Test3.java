package com.database.apr10;

public class Test3 {
    public static void main(String[] args) {
        A a1=new A(18,"bbb");
        a1.add(1,"aaa");
        System.out.println("data=" + a1.getData() + ", str=" + a1.getStr());
        System.out.println(a1.toString());
        a1.clear();
        System.out.println("data=" + a1.getData() + ", str=" + a1.getStr());
        System.out.println(a1.toString());
        A a2=new A();
        System.err.println(a2.getStr());
    }
}
class A{
    private int data;
    private String str;
    public A(){
    }
    public A(int data,String str){
        this.data=data;
        this.str=str;
    }
    public void add(int k,String s){
        this.data+=k;
        this.str+=s;
    }
    public void clear(){
        this.data=0;
        this.str=null;
    }
    public String toString() {
        return "A [data=" + data + ", str=" + str + "]";
    }
    public int getData() {
        return data;
    }
    public String getStr() {
        return str;
    }
    
}
