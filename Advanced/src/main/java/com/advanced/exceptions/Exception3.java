package com.advanced.exceptions;

public class Exception3 {
    public static int divide(int x,int y) throws DivideByMinusExecption{
        int result= x/y;
        y=0;
        if (y==0) {
            throw new DivideByMinusExecption("除数为零错误");
        }
        return result;
    }public static void main(String[] args) throws DivideByMinusExecption {
        // 1.用try-catch处理异常
        try {
            System.out.println(divide(6, 3));
        } catch (DivideByMinusExecption e) {
            e.printStackTrace();
        }
        // 2.不处理异常，向上抛出
        System.out.println(divide(6, 0));
    }
}
