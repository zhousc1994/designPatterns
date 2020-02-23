package adapter.entity;

/**
 * 源（Adaptee）：需要被适配的对象或类型
 * 实现功能：造车（白色宝马）
 * 目标功能：改变汽车颜色
 */
public class CarFactoryImplBm implements CarFactory {

    @Override
    public Car createCar() {
        Car car = new Car();
        car.setName("宝马");
        car.setColor("白色");
        return car;
    }
}
