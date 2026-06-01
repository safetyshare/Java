package com.advanced.morethread;

public class Example01 {
    static void main() {
        MyThread1 thread1=new MyThread1("线程1");
        thread1.start();
        MyThread1 thread2=new MyThread1("线程2");
        thread2.start();
    }
}
