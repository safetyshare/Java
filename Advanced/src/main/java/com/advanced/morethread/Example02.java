package com.advanced.morethread;

public class Example02 {
    static void main() {
        MyThread2 thread2=new MyThread2();
        Thread t1=new Thread(thread2,"t1");
        t1.start();
        MyThread2 thread3=new MyThread2();
        Thread t3=new Thread(thread3,"t3");
        t3.start();

    }
}
