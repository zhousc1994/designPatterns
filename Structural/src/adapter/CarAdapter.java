package adapter;

import adapter.entity.Car;
import adapter.entity.CarFactoryImplBm;

/**
 * 适配器（Adapter）：连接目标和源的中间对象，相当于插头转换器。
 * 1.通过继承方式实现造白色宝马车功能
 * 2.通过实现目标功能，实现改变颜色功能
 * 类适配器模式：
 */
public class CarAdapter extends CarFactoryImplBm implements CarDemand {
    @Override
    public Car changeColor(Car car) {
        car.setColor("黑色");
        return car;
    }
}
