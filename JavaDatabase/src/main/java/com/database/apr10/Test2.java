package com.database.apr10;

public class Test2 {
    public static void main(String[] args) {
        Student s1=new Student("李华","210000");
        s1.setMath(60);
        s1.setChinese(50);
        s1.setEnglish(80);
        System.out.println(s1.Sum());
        System.out.println(s1.Average());
        System.out.println(s1.toString());
        System.err.println("姓名："+s1.getName());
        System.err.println("学号："+s1.getStudentID());
        System.err.println("数学成绩："+s1.getMath());
        System.err.println("语文成绩："+s1.getChinese());
        System.err.println("英语成绩："+s1.getEnglish());
    }
}
class Student {
    private String Name;
    private String StudentID;
    private double Math;
    private double Chinese;
    private double English;
    Student(){}
    Student(String Name,String StudentID,double Math,double Chinese,double English){
        this.Name=Name;
        this.StudentID=StudentID;
        this.Math=Math;
        this.Chinese=Chinese;
        this.English=English;
    }
    Student(String Name,String StudentID){
        this.Name=Name;
        this.StudentID=StudentID;
        this.Math=0;
        this.Chinese=0;
        this.English=0;
    }
    public String toString() {
        return "姓名=" + Name + "\n学号=" + StudentID + "\n数学成绩=" + Math + "\n语文成绩=" + Chinese
                + "\n英语成绩=" + English;
    }
    public double Sum(){
        return Math+Chinese+English;
    }
    public double Average(){
        return (Math+Chinese+English)/3.0;
    }
    public double getMath() {
        return Math;
    }
    public void setMath(double math) {
        Math = math;
    }
    public double getChinese() {
        return Chinese;
    }
    public void setChinese(double chinese) {
        Chinese = chinese;
    }
    public double getEnglish() {
        return English;
    }
    public void setEnglish(double english) {
        English = english;
    }

    public String getName() {
        return Name;
    }

    public String getStudentID() {
        return StudentID;
    }
}