package com.wangshicheng.Structural.Adapter.sample;

import java.util.Arrays;

/**
 * 编写一个 Adapter 的步骤如下
 * 1 继承/实现目标接口，这里是 TargetInterface；
 * 2 提供一个接收转换接口的构造方法，这里的转换接口是 TobeTransformed 接口；
 * 3 在目标接口实现方法内部，调用待转换接口的方法；
 */
public class Adapter implements TargetInterface{

    private OriginalInterface originalInterface;

    public Adapter(OriginalInterface originalInterface) {
        this.originalInterface = originalInterface;
    }

    @Override
    public void businessProcess() {
        //在目标接口实现方法内部，调用待转换接口的方法
        originalInterface.number();
    }
}
