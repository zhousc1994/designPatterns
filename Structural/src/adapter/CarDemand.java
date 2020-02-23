package adapter;

import adapter.entity.Car;

/**
 *目标（Target）：期待得到的目标
 * 期待实现的功能（改变汽车颜色）
 */
public interface CarDemand {

    public Car changeColor(Car car);
}
