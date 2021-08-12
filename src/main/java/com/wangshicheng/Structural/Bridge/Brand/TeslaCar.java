package com.wangshicheng.Structural.Bridge.Brand;

import com.wangshicheng.Structural.Bridge.RefinedCar;
import com.wangshicheng.Structural.Bridge.abstractEngine;

public class TeslaCar extends RefinedCar {

    public TeslaCar(com.wangshicheng.Structural.Bridge.abstractEngine abstractEngine) {
        super(abstractEngine);
    }

    @Override
    public String getBrand() {
        return "Tesla";
    }
}
