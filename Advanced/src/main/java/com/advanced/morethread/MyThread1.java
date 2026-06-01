package com.advanced.morethread;

public class MyThread1 extends Thread{
    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i=0;
        while (i++<5){
            System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
        }
    }
}
