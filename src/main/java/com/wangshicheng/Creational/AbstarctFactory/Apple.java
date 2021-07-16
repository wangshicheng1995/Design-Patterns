package com.wangshicheng.Creational.AbstarctFactory;


import com.wangshicheng.Creational.AbstarctFactory.Entity.AppleWatch;
import com.wangshicheng.Creational.AbstarctFactory.Entity.MacBook;

public interface Apple {

    MacBook createMacBook(String specification);

    AppleWatch createAppleWatch(String specification);
}
