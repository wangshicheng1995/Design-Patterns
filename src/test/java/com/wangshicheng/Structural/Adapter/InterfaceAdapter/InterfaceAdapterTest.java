package com.wangshicheng.Structural.Adapter.InterfaceAdapter;

import org.junit.Test;

/**
 * 提供具体的源角色，然后交由适配器进行适配。
 */
public class InterfaceAdapterTest {

    @Test
    public void test() {
        DC5V dc5V = new InterfaceAdapter(new AC220V());
        int dc = dc5V.dc5v();
        System.out.println("输入的电压为：" + new AC220V().output() + "伏");
        System.out.println("转换后的电压为：" + dc + "伏");
    }
}
