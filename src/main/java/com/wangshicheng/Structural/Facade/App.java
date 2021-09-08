package com.wangshicheng.Structural.Facade;

public class App {
    public static void main(String[] args) {
        Facade facade = new Facade();
        Company c = facade.openCompany("Echo company Ltd.");
        System.out.println(c.toString());
    }
}
