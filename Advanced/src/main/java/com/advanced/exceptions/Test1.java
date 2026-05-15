package com.advanced.exceptions;

public class Test1 {
    void main(){
        int i;int a;
        i=3;
        System.out.println("i= "+i);
        try {
            a=10/0;
            System.out.println("a= "+a);

        } catch (ArithmeticException a1) {
            System.err.println("除数不为零");
        }finally {
            i=0;
            a=0;
        }
        int c=5;
        System.out.println("c= "+c);
    }

}
