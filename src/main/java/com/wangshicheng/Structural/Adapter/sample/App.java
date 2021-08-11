package com.wangshicheng.Structural.Adapter.sample;

/**
 * 调用类
 */
public class App {
    public static void main(String[] args) {
        OriginalInterface originalInterface = new Task();
        new Test(new Adapter(originalInterface)).test();
    }
}
