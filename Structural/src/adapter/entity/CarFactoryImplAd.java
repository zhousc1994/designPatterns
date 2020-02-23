package adapter.entity;

public class CarFactoryImplAd implements CarFactory {
    @Override
    public Car createCar() {
        Car car = new Car();
        car.setName("奥迪");
        car.setColor("黑色");
        return car;
    }
}
