package com.wangshicheng.creational.AbstarctFactory.Byd.factory;

import com.wangshicheng.creational.AbstarctFactory.Apple;
import com.wangshicheng.creational.AbstarctFactory.Byd.products.BydAppleWatch;
import com.wangshicheng.creational.AbstarctFactory.Byd.products.BydMac;
import com.wangshicheng.creational.AbstarctFactory.Entity.AppleWatch;
import com.wangshicheng.creational.AbstarctFactory.Entity.MacBook;

/**
 * 比亚迪的工厂
 *
 * @author wangshicheng
 * @date 2021/6/28
 **/
public class BydFactory implements Apple {

    @Override
    public MacBook createMacBook(String specification) {
        return new BydMac(specification);
    }

    @Override
    public AppleWatch createAppleWatch(String specification) {
        return new BydAppleWatch(specification);
    }
}
