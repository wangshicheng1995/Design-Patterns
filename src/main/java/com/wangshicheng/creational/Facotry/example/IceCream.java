package com.wangshicheng.creational.Facotry.example;

public class IceCream {

    private String flavor;
    private String size;

    public IceCream(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
