package adapter;

import adapter.entity.Car;
import adapter.entity.CarFactoryImplBm;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

//        CarFactoryImplBm carFactoryImplBm = new CarFactoryImplBm();
//        Car car = carFactoryImplBm.createCar();
//        Arrays
        CarAdapter carAdapter = new CarAdapter();
        Car car = carAdapter.createCar();
        System.out.println(car.getColor()+car.getName());

        carAdapter.changeColor(car);
        System.out.println(car.getColor()+car.getName());

    }
}
