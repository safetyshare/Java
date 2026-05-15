package com.advanced.exceptions;

public class Exception2 {
    public static int divide(int x,int y) throws Exception{
        int result= x/y;
        // int[] a=new int[3];
        // a[5]=8;
        return result;
    }
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(divide(6,3));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(divide(6,3));
    }
}
