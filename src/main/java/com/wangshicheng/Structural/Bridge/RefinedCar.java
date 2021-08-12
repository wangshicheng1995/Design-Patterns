package com.wangshicheng.Structural.Bridge;

/**
 * 修正抽象类，拓展抽象化角色
 */
public abstract class RefinedCar extends Car {

    public RefinedCar(abstractEngine abstractEngine) {
        super(abstractEngine);
    }

    @Override
    public void drive() {
        this.abstractEngine.start();
        System.out.println("This is a " + getBrand() + "car");
    }

    public abstract String getBrand();
}
