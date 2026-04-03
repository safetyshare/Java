package com.database.mar20;

public class example2 {
    static void main(){
        int j,i;
        for(i=1;i<=9;i++){
            for(j=1;j<=i;j++){
                System.out.print(j +"*"+i+"="+(j*i));
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
