package com.database.jul03;

public class TestStudent{
    public static void main(String[] args) {
    Person p1 = new Student("张三", "女", 14, 37, 57, 66);
    Person p2=new Student("李四", "男", 15, 80, 85, 90);
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    Student s1=(Student)p1;
    Student s2=(Student)p2;
    System.out.println(s1.average());
    System.out.println(s2.average());
    }
}
class Person{
    protected String name,sex;
    protected int age;
    public Person(){
    }
    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
    }
    
}
class Student extends Person{
    private int math,chinese,english;
    public Student(){}
    public Student(String name, String sex, int age, int math, int chinese, int english) {
        super(name, sex, age);
        this.math = math;
        this.chinese = chinese;
        this.english = english;
    }
    public double average(){
        return (math+chinese+english)/3.0;

    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", sex=" + sex + ", age=" + age + ", math=" + math + ", chinese=" + chinese
                + ", english=" + english + ", average()=" + average() + "]";
    }
    
}