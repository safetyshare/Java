package com.advanced.morethread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class e15 {
    static void main() {
        si si = new si();
        Thread Thread1 = new Thread(si,"1");
        Thread thread2 = new Thread(si, "2");
        Thread1.start();
        thread2.start();
    }
}
class si implements Runnable{
    private static final Lock look1=new ReentrantLock();
    private static final Lock look2=new ReentrantLock();
    int AA=12;int BB=13;
    @Override
    public void run() {
        synchronized (look1){
            for (int i = 0; i < 5; i++) {
                AA++;BB+=2;
                System.out.println(Thread.currentThread().getName()+AA+"，"+BB);
            }

        }
        synchronized (look2){
            for (int i = 0; i <5 ; i++) {
                BB++;
            }

        }
        look1.lock();
        look2.lock();
    }
}
