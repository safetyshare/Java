package com.advanced.morethread;

public class zuoye2 {
    static void main() throws InterruptedException {
        addNumber addNumber = new addNumber();
        Thread t1=new Thread(addNumber,"1");
        Thread t2=new Thread(addNumber,"2");
        Thread t3=new Thread(addNumber,"3");
        Thread t4=new Thread(addNumber,"4");
        Thread t5=new Thread(addNumber,"5");
        Thread t6=new Thread(addNumber,"6");
        Thread t7=new Thread(addNumber,"7");
        Thread t8=new Thread(addNumber,"8");
        Thread t9=new Thread(addNumber,"9");
        Thread t10=new Thread(addNumber,"0");
        t1.start();t2.start();t3.start();t4.start();t5.start();
        t6.start();t7.start();t8.start();t9.start();t10.start();
//        t1.join();t2.join();t3.join();t4.join();t5.join();
//        t6.join();t7.join();t8.join();t9.join();t10.join();
        Thread[] threads={t1,t2,t3,t4,t5,t6,t7,t8,t9,t10};
        @SuppressWarnings("unused")
        boolean finish;
        do {
            finish=true;
            for(Thread t:threads){
                if (t.isAlive()){
                    finish=false;break;
                }
                Thread.sleep(300);
            }
        }while (finish=false);
        System.out.println(com.advanced.morethread.addNumber.getNumber());
    }
}
class addNumber implements Runnable {
//    private int sum;
    private static int number = 0;

    @Override
    public void run() {
        int calcNum = add();
        setNumber(calcNum);
    }

    public static int add() {
        int sum = 0;
        int LinShi = ((Integer.parseInt(Thread.currentThread().getName()) * 10) + 1);
        for (int i = 1; i <= 10; i++) {
            sum += LinShi++;
        }
        return sum;
    }

    public static synchronized int getNumber() {
        return addNumber.number;
    }

    public static synchronized void setNumber(int number) {
        addNumber.number += number;
    }
}
