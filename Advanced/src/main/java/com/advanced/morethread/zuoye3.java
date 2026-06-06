package com.advanced.morethread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;


public class zuoye3 {
    static void main()  {
        ThreadFactory factory = new ThreadFactoryBuilder().setNameFormat("%d").build();
        try (ExecutorService pool = Executors.newFixedThreadPool(10, factory)) {
            for (int i = 1; i <=10 ; i++) {
                pool.submit(new addNumber());
            }
            pool.shutdown(); // 不接受新任务，执行完现有任务关闭
            while (!pool.isTerminated()) {
                // 等待所有线程结束
            }
            System.out.println(addNumber.getNumber());
        }
    }
}