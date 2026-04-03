package com.mar.sixteen;
import java.util.Scanner;
public class baoxianxiang
{
    static void main()
    {
        Scanner sc =new Scanner(System.in);
        int password1;
        int password2;
        System.out.print("请输入第一层密码：");
        password1=sc.nextInt();
        if (password1==1234)
        {
            System.out.println("第一层密码正确，请输入第二层密码：");
            password2=sc.nextInt();
            if(password2==4321)
            {
                System.out.println("第二层密码正确，保险箱开启成功！！！");
            }
            else{
                System.out.println("第二层密码错误，保险箱开启失败");
            }
        }
        else {
            System.out.println("第一层错误，保险箱开启失败");
        }
    }
}
