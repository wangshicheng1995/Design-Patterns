package com.wangshicheng.Structural.Adapter.InterfaceAdapter;

/**
 * 具体的110V电源
 */
public class AC110V extends ACV {

    @Override
    public int output() {
        return 110;
    }
}
