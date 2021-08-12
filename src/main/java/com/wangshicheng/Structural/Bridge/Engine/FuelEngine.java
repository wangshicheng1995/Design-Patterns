package com.wangshicheng.Structural.Bridge.Engine;

import com.wangshicheng.Structural.Bridge.abstractEngine;

public class FuelEngine implements abstractEngine {

    @Override
    public void start() {
        System.out.println("Fuel Engine");
    }
}
