package com.gcl.栈帧02;

/**
 * @Author 小关同学
 * @Create 2022/1/9 16:38
 */
public class TestFrames {
    //一个方法就是一个栈帧（详情去看JVM中的虚拟机栈）
    public static void main(String[]args){
        int num = method1(1);
        System.out.println(num);
    }

    private static int method1(int x){
        int y = x + 1;
        Object m = method2();
        System.out.println(m);
        return y;
    }

    private static Object method2(){
        Object n = new Object();
        return n;
    }
}