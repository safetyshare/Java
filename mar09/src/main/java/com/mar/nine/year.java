package com.mar.nine;

public class year {
    public static void main(String[] args) {
        int year=2001;
        boolean p=year%4==0&&(year%100!=0||year%400==0);
        if (p) {
            System.out.println(year+"为闰年");
            
        }
        else{
            System.out.println(year+"不为闰年");
        }
    }
}
