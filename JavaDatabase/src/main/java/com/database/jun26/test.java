package com.database.jun26;

public class test {
    public static void main(String[] args) {
        int[] data=new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i]=(int)(Math.random()*(500-100+1)+100);   
        }
        int sum=0;
        for (int i : data) {
            if (i%3==0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("sum="+sum);
    }
}
