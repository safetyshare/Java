package com.database.mar23;
import java.util.Scanner;
public class zuoye {
    static void main(){
        double[] arr1=new double[12];
        double sum=0,avg;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr1.length;i++){
            System.out.print("请输入"+(i+1)+"月降雨量");
            arr1[i]=sc.nextDouble();
            sum+=arr1[i];
        }
        avg=sum/12;
        System.out.println("平均值为："+avg);
        for (int i=0;i<arr1.length;i++){
            System.out.println((i+1)+"月降雨量与平均降雨量的差为："+(arr1[i]-avg));
        }sc.close();
    }
}
