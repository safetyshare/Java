package com.database.jun26;

public class PensonTest {
    public static void main(String[] args) {
        Person p1 = new Teacher("Alice", "Female", "Chinese", "MIT", "Math");
        p1.speak();
        System.out.println(p1.toString());
        Teacher t1=(Teacher)p1;
        t1.teach();
        Person p2=new Student("Bob", "Male", "American", "Harvard");
        p2.speak();
        System.out.println(p2.toString());
        Student s1=(Student)p2;
        s1.study();
    }
}

abstract class Person{
    private String name;
    private String sex;
    private String nationality;
    abstract void speak();
    public Person(String name, String sex, String nationality) {
        this.name = name;
        this.sex = sex;
        this.nationality = nationality;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
}
class Teacher extends Person{
    private String school;
    private String subject;
    public void teach(){
        System.out.println(school);
    }
    @Override
    void speak() {
        System.out.println("用"+getNationality()+"语言授课交流");
    }
    public Teacher(String name, String sex, String nationality, String school, String subject) {
        super(name,sex,nationality);
        this.school=school;
        this.subject=subject;
    }
    @Override
    public String toString() {
        return "Teacher [school=" + school + ", subject=" + subject + ", getName()=" + getName() + ", getSex()="
                + getSex() + ", getNationality()=" + getNationality() + "]";
    }
    
}
class Student extends Person{
    private String school;
    public void study(){
        System.out.println("在" + school + "学校学习");
    }
    @Override
    void speak() {
        System.out.println("用"+getNationality()+"语言学习交流");
    }
    public Student(String name, String sex, String nationality, String school) {
        super(name, sex, nationality);
        this.school = school;
    }
    @Override
    public String toString() {
        return "Student [school=" + school + ", getName()=" + getName() + ", getSex()=" + getSex()
                + ", getNationality()=" + getNationality() + "]";
    }
    
}