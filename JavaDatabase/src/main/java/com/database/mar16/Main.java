package com.database.mar16;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入一个成绩");
        int score=sc.nextInt();
        if (score >=90&&score <=100)
        {
            System.out.println("成绩优秀");
        }
        else if(score >=80&&score <=89)
        {
            System.out.println("成绩良好");
        }
        else if(score >=70&&score <=79)
        {
            System.out.println("成绩中等");
        }
        else if(score >=60&&score <=69)
        {
            System.out.println("成绩及格");
        }
        else if(score >=0&&score <=59)
        {
            System.out.println("成绩不及格");
        }
        else
        {
            System.out.println("输入错误");
        }sc.close();
    }
}
