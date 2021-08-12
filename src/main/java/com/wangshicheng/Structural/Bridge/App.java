package com.wangshicheng.Structural.Bridge;

import com.wangshicheng.Structural.Bridge.Brand.BenzCar;
import com.wangshicheng.Structural.Bridge.Brand.LixiangCar;
import com.wangshicheng.Structural.Bridge.Brand.TeslaCar;
import com.wangshicheng.Structural.Bridge.Engine.ElectricEngine;
import com.wangshicheng.Structural.Bridge.Engine.FuelEngine;
import com.wangshicheng.Structural.Bridge.Engine.HybridEngine;

public class App {
    public static void main(String[] args) {
        /*
         * 品牌与引擎的自由组合
         * - 奔驰 + 燃油
         * - 特斯拉 + 电动
         * - 理想 + 混动
         */
        RefinedCar benz = new BenzCar(new FuelEngine());
        RefinedCar tesla = new TeslaCar(new ElectricEngine());
        RefinedCar lixaing = new LixiangCar(new HybridEngine());

        benz.drive();
        tesla.drive();
        lixaing.drive();
    }
}
