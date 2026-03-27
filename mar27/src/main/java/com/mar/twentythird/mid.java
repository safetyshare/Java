package com.mar.twentythird;

public class mid {
    static void main(){
        int [][] s3={{3,7,1},{1,2,8,5,6},{9,3,6,8}};
        for (int[] ints : s3) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();

        }
    }
}
