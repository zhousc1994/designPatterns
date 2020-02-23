package bridging;

import bridging.impl.CarImpl;
import bridging.impl.White;

public class Main {

    public static void main(String[] args) {
        White white = new White();
        CarImpl car = new CarImpl();
        car.setColor(white);
        car.makeCar();
    }
}
