package com.database.mar09;
import java.util.Scanner;
public class example5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入成绩：");
        double score=sc.nextDouble();
        if (score >=60&&score <=100) {
            System.out.println("成绩及格");
        }
        else if (score<60&&score>=0){
            System.out.println("成绩不及格");
        }
        else
        {
            System.out.println("输入错误！");
        }
        sc.close();
    }
}
