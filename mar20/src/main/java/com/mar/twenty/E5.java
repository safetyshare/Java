package com.mar.twenty;

public class E5 {
    public static void main(String[] args) {
        int j=10,i=1;
        do{
            if (i++>--j)continue;
        }while (i<5);
    }
}
