package com.wangshicheng.Structural.Adapter.sample;

/**
 * Test 类实例化需要的 TargetInterface，而提供的是 OriginalInterface,
 * 用 Adapter 转换后即可实例化
 */
public class Test {

    private TargetInterface targetInterface;

    public Test(TargetInterface targetInterface) {
        this.targetInterface = targetInterface;
    }

    public void test() {
        System.out.println("test");
    }
}
