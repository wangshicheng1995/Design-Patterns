package com.wangshicheng.Structural.Adapter.ClassAdapter;

import org.junit.Test;

/**
 * 基于类的适配器模式
 */
public class ClassClassObjectAdapterTest {

    @Test
    public void Test() {
        DC5V dc5V = new ClassAdapter();
        int dc5 = dc5V.dc5v();
        System.out.println("转换后的电压为：" + dc5 + " 伏");
    }
}