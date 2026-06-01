package com.advanced.morethread;

public class Example03 {
    static void main() {
        TicketWindow tw=new TicketWindow();
        new Thread(tw,"窗口 1").start();
        new Thread(tw,"窗口 2").start();
        new Thread(tw,"窗口 3").start();
        new Thread(tw,"窗口 4").start();
    }
}
class TicketWindow implements Runnable {
    private int tickets = 100;
    public void run() {
        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + " 正在发售第 " + tickets-- + " 张票 ");
            }else {
                System.out.println(Thread.currentThread().getName()+"的票已经卖完");
                System.exit(0);
            }
        }
    }
}
