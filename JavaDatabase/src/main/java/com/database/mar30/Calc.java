package com.database.mar30;
import java.util.Scanner;
public class Calc {
    static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int a=sc.nextInt();
        System.out.print("请输入第二个数：");
        int b=sc.nextInt();
        Add add=new Add();
        System.out.println("两数之和为："+add.add(a,b));
        sc.close();
    }
}
class Add {
    public int add(int a, int b) {
        return a + b;
    }
}
