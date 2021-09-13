package com.wangshicheng.Structural.Adapter.ObjectAdapter;

import com.wangshicheng.Structural.Adapter.ClassAdapter.AC220V;
import com.wangshicheng.Structural.Adapter.ClassAdapter.DC5V;
import org.junit.Test;

/**
 * 基于对象的适配器模式
 */
public class ObjectClassObjectAdapterTest {

    @Test
    public void Test(){
        DC5V dc5V = new ObjectAdapter(new AC220V());
        int dc5 = dc5V.dc5v();
        System.out.println("输入的电压为：" + new AC220V().output220v() + "伏");
        System.out.println("转换后的电压为：" + dc5 + " 伏");
    }
}
