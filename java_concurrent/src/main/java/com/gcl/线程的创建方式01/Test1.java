package com.gcl.线程的创建方式01;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author 小关同学
 * @Create 2022/1/8 17:50
 * 第一种创建线程的方式
 */
@Slf4j(topic = "c.Test1")
public class Test1 {
    public static void main(String[] args) {
//        Thread thread = new Thread("thread1"){
//            public void run(){
//                log.debug("running");
//            }
//        };

        //lambada表达式写法
        Thread thread = new Thread(()-> log.debug("running"),"thread1");
        thread.start();
        log.debug("running");
    }
}