package com.advanced.morethread;

public class zuoye {
    static void main() {
        sendHomework sendHomework = new sendHomework();
        Thread t1=new Thread(sendHomework,"教师1");
        Thread t2=new Thread(sendHomework,"教师2");
        Thread t3=new Thread(sendHomework,"教师3");
        Thread t4=new Thread(sendHomework,"教师4");
        Thread t5=new Thread(sendHomework,"教师5");
        Thread t6=new Thread(sendHomework,"教师6");
        Thread t7=new Thread(sendHomework,"教师7");
        Thread t8=new Thread(sendHomework,"教师8");
        Thread t9=new Thread(sendHomework,"教师9");
        Thread t10=new Thread(sendHomework,"教师10");
        t1.start();t2.start();t3.start();t4.start();t5.start();
        t6.start();t7.start();t8.start();t9.start();t10.start();
    }
}
class sendHomework implements Runnable{
    private int biji=80;
    @Override
    public void run() {
        while (true){
            send();
        }
    }

    public synchronized void send() {
            if (biji>0){
                try{
                    System.out.println(Thread.currentThread().getName()+"正在发送第"+(biji--)+"份作业");
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else System.exit(0);
    }
}