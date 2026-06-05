package com.advanced.morethread;

public class exam09 {
    static void main() {
        yi y1=new yi();
        Thread t1=new Thread(y1,"第一");
        Thread t2=new Thread(y1,"第二");
        t1.start();t2.start();
    }
}
class yi implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+i);
            if (i==2){
                Thread.yield();
                System.out.println("让步");
            }
        }
    }
}