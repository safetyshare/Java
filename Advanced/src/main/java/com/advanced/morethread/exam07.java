package com.advanced.morethread;

public class exam07 {
    static void main() {
        Thread t3 = new Thread(new shuchu(),"a");
        Thread t4 = new Thread(new shuchu(),"b");
        t3.start();
        t4.start();
    }

}
class shuchu extends Thread{
    public void run(){
        for (int j = 0; j < 10; j++) {
            System.out.println(Thread.currentThread().getName()
                    + "正在输出j：" + j);
        }
    }
}