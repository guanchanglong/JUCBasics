package com.gcl.常用方法.sleep和yield方法;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author 小关同学
 * @Create 2022/1/10 16:03
 */
@Slf4j(topic = "c.YieldTest")
public class YieldTest {
    public static void main(String[] args) {
        Runnable task1 = ()->{
            int count = 0;
            for (;;){
                Thread.yield();
                System.out.println("---->1 " + count++);
            }
        };
        Runnable task2 = ()->{
            int count = 0;
            for (;;){
                System.out.println("        ---->2 " + count++);
            }
        };
        Thread thread1 = new Thread(task1,"thread1");
        Thread thread2 = new Thread(task2,"thread2");
        thread1.setPriority(Thread.MIN_PRIORITY);   //设置线程优先级
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
    }
}
