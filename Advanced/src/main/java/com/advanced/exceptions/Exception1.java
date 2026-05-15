package com.advanced.exceptions;

public class Exception1 {
    public static int divide(int x,int y){
        try {
            int result= x/y;
            int[] a=new int[3];
            a[5]=8;
            return result;
        } catch (ArithmeticException e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e1){
            e1.printStackTrace();
        }
        // 范围从小到大
        finally{
            System.out.println("收尾工作，指针归零，清空内存");
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(divide(6,3));
//        Exception1.divide(1, 0);
        System.out.println(divide(3, 0));
        
    }
}
