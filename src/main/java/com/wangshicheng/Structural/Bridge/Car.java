package com.wangshicheng.Structural.Bridge;

public abstract class Car {

    protected abstractEngine abstractEngine;

    /**
     * 桥接 - 将 Car 的品牌将引擎连接起来
     */
    public Car(abstractEngine abstractEngine) {
        this.abstractEngine = abstractEngine;
    }

    public abstract void drive();
}
