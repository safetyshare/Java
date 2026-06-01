package com.advanced.morethread;

public class Example03 {
    static void main() {
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
    }
}
class TicketWindow extends Thread {
    private int tickets = 100;
    public void run() {
        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName()
                        + " 正在发售第 " + tickets-- + " 张票 ");
            }
        }
    }
}
