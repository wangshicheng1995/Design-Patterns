package com.wangshicheng.Creational.Facotry.example;

public class App {
    public static void main(String[] args) {
        IceCreamFactory factory = IceCreamFactory.getFactory();
        IceCream result = factory.produce("Strawberry", "large");
        System.out.println(result.getFlavor());
        System.out.println(result.getSize());
    }
}
