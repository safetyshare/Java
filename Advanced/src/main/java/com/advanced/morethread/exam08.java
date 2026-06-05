package com.advanced.morethread;

public class exam08 extends Thread {
    static void main() {
        exam08 a1=new exam08();
        Thread thread2 = new Thread(a1,"q");
        Thread thread1 = new Thread(a1,"w");
        thread1.start();
        thread2.start();

    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            if (i == 2) {
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}


//class a implements Runnable{
//    @Override
//    public void run() {
//        for (int i=0;i<10;i++){
//            System.out.println(Thread.currentThread().getName()+i);
//            if (i==2){
//                try {
//                    thread.sleep(30);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }
//}