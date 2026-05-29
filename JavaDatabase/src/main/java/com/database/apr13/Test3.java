package com.database.apr13;

public class Test3 {
    static void main(){
        // Student s3=new Student("aaa",4,59);
        Person p1=new Person();
        Person p2=new Student();//正确：子类对象肯定首先是一个父类对象。（向上转型（把子类对象转型为父类对象）是自动进行的）
        @SuppressWarnings("unused")
        Student s1=new Student();
        // Student s2=new Person();//错误：父类对象未必是一个子类对象。
        p1.study();
        p2.study();
        // 转型
        // 向下转型（把父类对象转型为子类对象）
        @SuppressWarnings("unused")
        Student s3;
        s3=(Student)p1;//p1纯粹的人（不可行）（没有语法错误，但运行时会抛出异常）
        s3=(Student)p2;//p2本来是一个学生的人
    }
}
class Person{
    @SuppressWarnings("unused")
    private String name;
    @SuppressWarnings("unused")
    private int age;
    public Person(){

    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void study(){
        System.out.println("学习");
    }
    public void laodong(){
        System.out.println("劳动");

    }
}
class Student extends Person{
    @SuppressWarnings("unused")
    private int score;
    public Student(){

    }
    public Student(String name,int age,int score){
        super(name, age);
        this.score=score;

    }
    public void kaoshi(){
        System.out.println("考试");

    }
    public void study(){
        System.out.println("学生在学习");
    }
}