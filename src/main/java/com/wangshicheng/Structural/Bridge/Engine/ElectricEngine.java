package com.wangshicheng.Structural.Bridge.Engine;

import com.wangshicheng.Structural.Bridge.abstractEngine;

public class ElectricEngine implements abstractEngine {

    @Override
    public void start() {
        System.out.println("Electric Engine");
    }
}
