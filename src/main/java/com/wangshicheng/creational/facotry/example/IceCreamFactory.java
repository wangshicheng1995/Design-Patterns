package com.wangshicheng.creational.facotry.example;

public interface IceCreamFactory {

    static IceCreamFactory impl = new IceCreamFactoryImpl();

    /**
     * 创建方法
     **/
    IceCream produce(String flavor, String size);

    static IceCreamFactory getFactory() {
        return impl;
    }
}
