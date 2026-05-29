package com.advanced.collection;

import java.util.HashSet;

class Student{
    private int id;
    private String name;
    public Student(int id, String name){
        this.id=id;
        this.name=name;

    }


    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "学号："+id+"姓名："+name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (!(obj instanceof Student)){
            return false;
        }
        Student s = (Student)obj;
        boolean b=this.id==s.id;
        boolean c=Integer.toString(id).equals(Integer.toString(s.id));
        boolean d=Integer.compare(this.id,s.id)==0;
        return b;
    }

}
public class set3 {
    static void main() {
        HashSet<Student> set =new HashSet<Student>();
        Student s1=new Student(1,"jack");
        Student s2=new Student(2,"Rose");
        Student s3=new Student(2,"Rose");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.forEach(System.out::println);
    }
}
