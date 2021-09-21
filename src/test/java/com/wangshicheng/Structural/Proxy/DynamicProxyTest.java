package com.wangshicheng.Structural.Proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

/**
 * 动态代理
 */
public class DynamicProxyTest {

    @Test
    public void invoke() {
        IRentHouse rentHouse = new RentHouse();
        //定义一个 handler
        InvocationHandler handler = new DynamicProxy(rentHouse);
        //获得类的 class loader
        ClassLoader cl = rentHouse.getClass().getClassLoader();
        /*
         * 动态产生一个代理者
         * newProxyInstance(ClassLoader loader, Class<?>[] interfaces, invocationHandler h)
         */
        IRentHouse proxy = (IRentHouse)Proxy.newProxyInstance(cl, new Class[]{IRentHouse.class}, handler);
        proxy.rentHouse();

        ISellHouse sellHouse = new SellHouse();
        InvocationHandler handler1 = new DynamicProxy(sellHouse);
        ClassLoader cl1 = sellHouse.getClass().getClassLoader();
        ISellHouse proxy1 = (ISellHouse)Proxy.newProxyInstance(cl1, new Class[]{ISellHouse.class}, handler1);
        proxy1.sellHouse();
    }
}