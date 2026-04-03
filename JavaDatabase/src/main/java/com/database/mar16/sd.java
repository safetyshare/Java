package com.database.mar16;
import java.util.Scanner;
public class sd {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入一个成绩");
        int score=sc.nextInt();
        if(score>100||score<0){
            System.out.println("输入错误");
        }
        else {
            if (score >= 90) {
                System.out.println("成绩优秀");
            } else if (score >= 80) {
                System.out.println("成绩良好");
            } else if (score >= 70) {
                System.out.println("成绩中等");
            } else if (score >= 60) {
                System.out.println("成绩及格");
            } else
            {
                System.out.println("成绩不及格");
            }
        }
    }
}