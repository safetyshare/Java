package com.database.mar16;
import java.util.Scanner;
public class calc {
    @SuppressWarnings("resource")
    static void main()
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a=sc.nextInt();
        System.out.println("请输入第二个整数");
        int b= sc.nextInt();
        System.out.println("请选择您要的操作:\n1、加\n2、减\n3、乘\n4、除\n5、退出");
        int m= sc.nextInt();
        switch (m){
            case 1:
                System.out.println("x+y="+(a+b));break;
            case 2:
                System.out.println("x-y="+(a-b));break;
            case 3:
                System.out.println("x*y="+(a*b));break;
            case 4:
                System.out.println("x/y="+((double)a/b));break;
            case 0:
                return;
            default:
                System.out.println("选择错误");
        }
        }
}
