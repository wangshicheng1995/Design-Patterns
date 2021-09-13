package com.wangshicheng.Structural.Adapter.ObjectAdapter;

import com.wangshicheng.Structural.Adapter.ClassAdapter.AC220V;
import com.wangshicheng.Structural.Adapter.ClassAdapter.DC5V;

/**
 * 基于对象的适配器模式
 */
public class ObjectAdapter implements DC5V {

    private AC220V ac220V;

    public ObjectAdapter(AC220V ac220V) {
        this.ac220V = ac220V;
    }

    @Override
    public int dc5v() {
        int output220v = ac220V.output220v();
        return (output220v / 4);
    }
}
