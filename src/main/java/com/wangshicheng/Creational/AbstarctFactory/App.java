package com.wangshicheng.Creational.AbstarctFactory;


import com.wangshicheng.Creational.AbstarctFactory.Byd.factory.BydFactory;
import com.wangshicheng.Creational.AbstarctFactory.Entity.AppleWatch;
import com.wangshicheng.Creational.AbstarctFactory.Entity.MacBook;
import com.wangshicheng.Creational.AbstarctFactory.Foxconn.Factory.FoxconnFactory;

public class App {
    public static void main(String[] args) {
        // 创建 Apple，实际类型是 FoxconnFactory 和 BydFactory
        Apple foxconn = new FoxconnFactory();
        Apple byd = new BydFactory();

        // 富士康生产
        MacBook mac = foxconn.createMacBook("This is a MacBook Pro!");
        mac.save("build done");

        AppleWatch watch = foxconn.createAppleWatch("This is a AppleWatch Series 7!");
        watch.save("build done");

        // 比亚迪生产
        MacBook bydMac = byd.createMacBook("This is a MacBook Pro!");
        bydMac.save("build done");

        AppleWatch bydWatch = byd.createAppleWatch("This is a AppleWatch Series 7!");
        bydWatch.save("build done");
    }
}
