package com.advanced.morethread;

public class exam12 {
    static void main() {
        safea safea = new safea();
        Thread t1 = new Thread(safea,"1");
        Thread t2 = new Thread(safea,"2");
        t1.start();t2.start();
    }
}
class safea implements Runnable{

    private int x=20;
    public synchronized void run() {
        while (x>=0){
            System.out.println(Thread.currentThread().getName()+"\t"+x);
            x--;
        }
    }
}