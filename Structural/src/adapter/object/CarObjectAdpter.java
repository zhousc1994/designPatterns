package adapter.object;

import adapter.CarDemand;
import adapter.entity.Car;
import adapter.entity.CarFactoryImplAd;
import adapter.entity.CarFactoryImplBm;

/**
 * 对象适配器
 * 通过组合方式来实现适配器功能。
 */
public class CarObjectAdpter implements CarDemand {

    CarFactoryImplBm carFactoryImplBm;

    CarFactoryImplAd carFactoryImplAd;

    public CarObjectAdpter(CarFactoryImplAd carFactoryImplAd,CarFactoryImplBm carFactoryImplBm){
        carFactoryImplAd = carFactoryImplAd;
        carFactoryImplBm = carFactoryImplBm;
    }

    public Car createCar(String carType){
        Car car = null;
        if ("bm".equals(carType)){
            car = carFactoryImplBm.createCar();
        }
        if ("ad".equals(carType)){
            car = carFactoryImplAd.createCar();
        }
        return car;
    }

    @Override
    public Car changeColor(Car car) {
        car.setColor("红色");
        return car;
    }
}
