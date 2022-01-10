package com.gcl.常用方法.start和run方法;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author 小关同学
 * @Create 2022/1/10 15:14
 */
@Slf4j(topic = "c.SleepTest")
public class Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread("thread1"){
            @Override
            public void run(){
                log.debug("running");
            }
        };
        //直接调用run方法是不会启动多线程的
        //thread1.run();

        //在线程执行之前打印线程状态信息
        System.out.println(thread1.getState());  //NEW new表示线程创建了，但是还没有被CPU执行
        thread1.start();
        //在线程执行之后打印线程状态信息
        System.out.println(thread1.getState());  //RUNNABLE Runnable表示是运行状态
        log.debug("do other things...");
    }
}
