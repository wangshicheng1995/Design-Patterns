package com.wangshicheng.Structural.Adapter.InterfaceAdapter;

/**
 * 基于接口的适配器模式
 */
public class InterfaceAdapter implements DC5V{

    private ACV acv;

    public InterfaceAdapter(AC220V ac220V) {
        this.acv = ac220V;
    }

    public InterfaceAdapter(AC110V ac11V) {
        this.acv = ac11V;
    }

    @Override
    public int dc5v() {
        int ac = 0;
        if (acv != null) {
            ac = acv.output();
        }
        int sta = ac / 5;
        return (ac / sta);
    }
}
