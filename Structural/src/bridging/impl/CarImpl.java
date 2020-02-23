package bridging.impl;


import bridging.Car;

/**
 * RefinedAbstraction(扩充抽象类)：抽象类的具体实现（这里体现面向接口编程）
 */
public class CarImpl extends Car {

    @Override
    public void makeCar() {
        getColor().addColor("宝马");
    }
}
