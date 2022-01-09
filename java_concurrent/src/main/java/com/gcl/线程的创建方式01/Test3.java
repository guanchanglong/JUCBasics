package com.gcl.线程的创建方式01;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author 小关同学
 * @Create 2022/1/9 16:06
 * 创建线程的第三种方法
 * FutureTask的带返回值的方法
 */
@Slf4j(topic = "c.Test3")
public class Test3 {
    public static void main(String[] args) {
//        FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                log.debug("running");
//                Thread.sleep(5000);
//                return 100;
//            }
//        });

        //使用lambada表达式简化后的结果
        FutureTask<Integer> task = new FutureTask<>(() -> {
            log.debug("running");
            Thread.sleep(5000);
            return 100;
        });
        Thread thread = new Thread(task,"thread3");
        thread.start();
        try {
            //调用task的get方法来获取线程运行结束返回的值
            log.debug("{}",task.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
