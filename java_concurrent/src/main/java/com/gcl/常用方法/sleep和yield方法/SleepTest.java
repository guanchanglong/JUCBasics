package com.gcl.常用方法.sleep和yield方法;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @Author 小关同学
 * @Create 2022/1/10 15:30
 * sleep方法使用
 */
@Slf4j(topic = "c.SleepTest")
public class SleepTest {
    public static void main(String[] args) {
        Thread thread = new Thread("thread"){
            @Override
            public void run(){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
        //线程启动，状态为Runnable
        log.debug("thread state:{}", thread.getState());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //线程在Sleep，状态为TIMED_WAITING
        log.debug("thread state:{}", thread.getState());
        log.debug("interrupt...");
        thread.interrupt();  //睡眠中的线程被打断唤醒之后会报异常


        //TimeUnit的sleep方法使用
        log.debug("enter sleep...");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.debug("out sleep...");
    }
}
