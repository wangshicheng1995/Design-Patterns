package com.wangshicheng.Structural.Adapter;

import java.util.concurrent.Callable;

/**
 * 适配器设计模式
 */
public class Task implements Callable<Long> {

    private long num;

    public Task(long num) {
        this.num = num;
    }

    /**
     * 复习线程实现的三种方式
     * 1 继承 Thread 类，覆写 run() 方法。返回值空，线程一旦开始就一直执行
     * 2 实现 Runnable 接口，覆写 run() 方法
     * 3 继承 Callable 接口，覆写 call() 方法。使用 Thread 的构造方法接收 FutureTask<V> 对象并调用 start() 方法来启动多线程
     */
    @Override
    public Long call() throws Exception {
        long result = 0;
        for (long i = 1; i <= this.num; i++) {
            result = result + i;
        }
        System.out.println("Result:" + result);
        return result;
    }
}