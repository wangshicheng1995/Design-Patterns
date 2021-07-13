package com.wangshicheng.creational.Builder;

import com.wangshicheng.creational.Builder.Provider.CarOSProvider;
import com.wangshicheng.creational.Builder.Provider.ChairProvider;
import com.wangshicheng.creational.Builder.Provider.EngineProvider;
import com.wangshicheng.creational.Builder.Provider.WheelProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 生产汽车的类
 * 生产一辆汽车，需要各种零件:轮胎，发动机，座椅，自动辅助驾驶系统等。
 * 而这些零件，可以由多个不同的小型工厂来创建，最后组装成一辆完整的车。
 *
 * - 为了和工厂模式区分开，这里的零件生产商不再使用 Factory 命名，改为 provider
 * - 使用 Builder 模式时，适用于创建的对象比较复杂，最好一步一步创建出“零件”，最后再装配起来
 */
public class CarBuilder {
    private static WheelProvider wheelProvider = new WheelProvider();
    private static EngineProvider engineProvider = new EngineProvider();
    private static ChairProvider chairProvider = new ChairProvider();
    private static CarOSProvider carOSProvider = new CarOSProvider();

    public static void main(String[] args) {

        /**
         * Map<String, Object> 为车的生产线，生产车的零件
         *  - String 是零件名
         *  - Object 是零件的规格
         */
        Map<String, Object> line = new HashMap<>();
        line.put("Wheel", new Object());
        line.put("Engine", new Object());
        line.put("Chair", new Object());
        line.put("CarOS", new Object());

        buildCar(line);
    }

    public static Car buildCar(Map<String, Object> line) {
        Car car = new Car();
        for (Map.Entry<String, Object> entry : line.entrySet()) {
            String key = entry.getKey();
            Object partSpeci = entry.getValue();

            //生成器模式:对每一种类型编写不同的 Builder
            switch (key) {
                case "Wheel":
                    car.setWheel(wheelProvider.buildWheel(partSpeci));
                    break;
                case "Engine":
                    car.setEngine(engineProvider.buildEngine(partSpeci));
                    break;
                case "Chair":
                    car.setChair(chairProvider.buildChair(partSpeci));
                    break;
                case "CarOS":
                    car.setCarOS(carOSProvider.buildCarOs(partSpeci));
                    break;
                default:
                    break;
            }
        }
        return car;
    }
}
