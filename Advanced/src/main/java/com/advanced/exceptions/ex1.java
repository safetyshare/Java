package com.advanced.exceptions;

public class ex1 extends Exception{
    public static void main (String[] args) {
        int[] aa=new int[4];
        try {
            aa[5]=1;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
            //System.out.println();
        }
    }
}
