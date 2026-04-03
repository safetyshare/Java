package com.database.mar27;

public class zuoye {
    static void main(){
        int [][] s1=new int [4][4];
        for(int j=0;j<s1.length;j++){
            for(int i=0;i<s1[j].length;i++){
                s1[j][i]=(int)(Math.random()*11);
                System.out.print(s1[j][i]+"\t");
            }
            System.out.println();
        }
        int sum=0;
        for (int a=0;a<4;a++){
            sum+=s1[a][a];
        }
        System.out.println("对角线元素之和为: " + sum);
    }
}
