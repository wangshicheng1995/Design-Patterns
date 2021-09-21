package com.wangshicheng.Structural.Proxy;

public class SellHouse implements ISellHouse{

    @Override
    public void sellHouse() {
        System.out.println("买了一间房子");
    }
}
