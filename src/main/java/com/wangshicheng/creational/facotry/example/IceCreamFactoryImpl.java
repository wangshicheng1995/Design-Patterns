package com.wangshicheng.creational.facotry.example;


public class IceCreamFactoryImpl implements IceCreamFactory {

    @Override
    public IceCream produce(String flavor, String size) {
        return new IceCream(flavor, size);
    }
}
