package com.wangshicheng.Structural.Adapter;

import java.util.concurrent.Callable;

public class App {
    public static void main(String[] args) {
        Callable<Long> callable = new Task(10L);
        new Thread(new RunnableAdapter(callable)).start();
    }
}
