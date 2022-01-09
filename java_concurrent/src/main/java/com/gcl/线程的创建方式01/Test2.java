package com.gcl.线程的创建方式01;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author 小关同学
 * @Create 2022/1/9 15:56
 * 第二种创建线程的方式
 * 使用Runnable接口实现任务和线程分离的效果
 */
@Slf4j(topic = "c.Test2")
public class Test2 {
    public static void main(String[] args) {
        //把任务和线程分离了
        //Runnable接口只有一个抽象方法，有@FunctionalInterface修饰，表明它是函数式接口，有且只有一个抽象方法，可以被lambada表达式简化
        Runnable runnable = () -> log.debug("running");
        Thread thread = new Thread(runnable,"thread2");
        thread.start();
    }
}
