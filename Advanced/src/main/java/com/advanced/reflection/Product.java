package com.advanced.reflection;

public class Product {
    private static long count =0;
    private long id;
//    private long count=0;
    private String name;
    public Product(){
        System.out.println("无参方法");
        id=++count;
    }
    public void setString(long id,String name){
        this.id=id;
        this.name=name;
        System.out.println("有参方法");
    }
    private long getid(){
        System.out.println(id);
        System.out.println("私有方法");
        return id;
    }

}
