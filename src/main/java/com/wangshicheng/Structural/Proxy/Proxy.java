package com.wangshicheng.Structural.Proxy;

public class Proxy implements IRentHouse{

    private IRentHouse rentHouse;

    public Proxy(IRentHouse rentHouse) {
        this.rentHouse = rentHouse;
    }

    @Override
    public void rentHouse() {
        System.out.println("联系中介");
        System.out.println("看房");
        System.out.println("交中介费");
        rentHouse.rentHouse();
        System.out.println("中介负责维修管理");
    }
}
