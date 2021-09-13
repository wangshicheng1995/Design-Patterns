package com.wangshicheng.Structural.Adapter.InterfaceAdapter;

/**
 * 具体的 220V电源
 */
public class AC220V extends ACV{

    @Override
    public int output() {
        return 220;
    }
}
