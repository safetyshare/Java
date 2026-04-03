package com.database.mar27;

public class Main {
    static void main() {
        int [][] s1,s2;
        s1=new int[5][3];
        s2=new int[4][];
        s2[0]=new int[3];
        s2[1]=new int[2];
        s2[2]=new int[5];
        s2[3]=new int[8];
        for(int j=0;j<s1.length;j++){
            for(int i=0;i<s1[j].length;i++){
                s1[j][i]=(int)(Math.random()*51);
                System.out.print(s1[j][i]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int j=0;j<s2.length;j++){
            for(int i=0;i<s2[j].length;i++){
                s2[j][i]=(int)((Math.random()*51)+50);
                System.out.print(s2[j][i]+"\t");
            }
            System.out.println();

        }
    }
}
