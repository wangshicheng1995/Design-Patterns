package com.wangshicheng.Structural.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 * 根据代理的接口生成生产所有方法/给定一个接口，动态代理实现接口下所有方法
 */
public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }
}
