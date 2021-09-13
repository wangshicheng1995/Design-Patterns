package com.wangshicheng.Structural.Adapter.ClassAdapter;

/**
 * 基于类的适配器模式
 */
public class ClassAdapter extends AC220V implements DC5V {

    /**
     * 继承源角色实现目标角色
     * 通过实现目标角色中的方法调用源角色中的方法进行计算从而达到适配的效果
     */
    @Override
    public int dc5v() {
        int output220v = output220v();
        return (output220v / 4);
    }
}
