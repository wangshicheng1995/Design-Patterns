package com.wangshicheng.Structural.Bridge.Brand;

import com.wangshicheng.Structural.Bridge.abstractEngine;
import com.wangshicheng.Structural.Bridge.RefinedCar;

public class BenzCar extends RefinedCar {

    public BenzCar(abstractEngine abstractEngine) {
        super(abstractEngine);
    }

    @Override
    public String getBrand() {
        return "Benz";
    }

}
