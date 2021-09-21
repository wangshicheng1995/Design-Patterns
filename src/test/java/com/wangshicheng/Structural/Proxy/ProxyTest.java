package com.wangshicheng.Structural.Proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProxyTest {

    @Test
    public void rentHouse() {
        //定义租房
        IRentHouse rentHouse = new RentHouse();
        //定义中介
        Proxy proxy = new Proxy(rentHouse);
        //中介租房
        proxy.rentHouse();
    }
}