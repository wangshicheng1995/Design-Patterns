package com.wangshicheng.creational.AbstarctFactory;


import com.wangshicheng.creational.AbstarctFactory.Entity.AppleWatch;
import com.wangshicheng.creational.AbstarctFactory.Entity.MacBook;

public interface Apple {

    MacBook createMacBook(String specification);

    AppleWatch createAppleWatch(String specification);
}
