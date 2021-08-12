package com.wangshicheng.Structural.Bridge.Brand;

import com.wangshicheng.Structural.Bridge.RefinedCar;

public class LixiangCar extends RefinedCar {

    public LixiangCar(com.wangshicheng.Structural.Bridge.abstractEngine abstractEngine) {
        super(abstractEngine);
    }

    @Override
    public String getBrand() {
        return "Lixiang";
    }
}
