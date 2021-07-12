package com.wangshicheng.creational.AbstarctFactory.Foxconn.Factory;


import com.wangshicheng.creational.AbstarctFactory.Apple;
import com.wangshicheng.creational.AbstarctFactory.Entity.AppleWatch;
import com.wangshicheng.creational.AbstarctFactory.Entity.MacBook;
import com.wangshicheng.creational.AbstarctFactory.Foxconn.products.FoxconnAppleWatch;
import com.wangshicheng.creational.AbstarctFactory.Foxconn.products.FoxconnMacBook;

/**
 * 富士康的工厂
 *
 * @author wangshicheng
 * @date 2021/6/28
 **/
public class FoxconnFactory implements Apple {

    public FoxconnFactory() {
        super();
    }

    @Override
    public MacBook createMacBook(String specification) {
        return new FoxconnMacBook(specification);
    }

    @Override
    public AppleWatch createAppleWatch(String specification) {
        return new FoxconnAppleWatch(specification);
    }
}
