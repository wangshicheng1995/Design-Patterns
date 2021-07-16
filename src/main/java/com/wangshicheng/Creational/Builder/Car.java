package com.wangshicheng.Creational.Builder;

import com.wangshicheng.Creational.Builder.Part.CarOS;
import com.wangshicheng.Creational.Builder.Part.Chair;
import com.wangshicheng.Creational.Builder.Part.Engine;
import com.wangshicheng.Creational.Builder.Part.Wheel;

public class Car {

    private Wheel wheel;
    private Engine engine;
    private Chair chair;
    private CarOS carOS;

    public Car() {
    }

    public Car(Wheel wheel, Engine engine, Chair chair, CarOS carOS) {
        this.wheel = wheel;
        this.engine = engine;
        this.chair = chair;
        this.carOS = carOS;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public CarOS getCarOS() {
        return carOS;
    }

    public void setCarOS(CarOS carOS) {
        this.carOS = carOS;
    }
}
