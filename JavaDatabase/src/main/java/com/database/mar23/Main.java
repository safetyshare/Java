package com.database.mar23;
import java.util.Arrays;
public class Main {
    @SuppressWarnings("unused")
    static void main() {
        int h=0;
        int[] arr1,arr2;
        double[] arr3=new double[6];
        arr1=new int[3];
        arr2=new int[10];
        // 数组访问：逐个访问数组中的元素：数组名[下标]
        arr1[0]=6;
        //给arr2中的10个元素赋值，赋随机数
        // 数组的length属性：数组名.length
        for (int i=0;i<=9;i++){
            arr2[i]=(int)(Math.random()*101);
            System.out.print(arr2[i]+"\t");
            h++;
            if (h==5) {
                System.out.println();
                h=0;
            }
        }
        int max=arr2[0];
        for (int j : arr2) {
            if (j > max) {
                max = j;
            }
        }
       System.out.println("最大值是：" + max);
       int min=arr2[0];
       for(int i=0;i<arr2.length;i++){
            if (arr2[i]<min) {
                min=arr2[i];
            }
        }
       System.out.println("最小值是：" + min);
       int sum=0;
       for (int k : arr2) {
           sum+=k;
       }
       System.out.println("平均值为："+((double)sum)/arr2.length);
       Arrays.sort(arr2);
//       排序后：
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
//       System.out.println(Arrays.toString(arr2));
    }
}