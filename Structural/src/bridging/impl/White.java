package bridging.impl;

import bridging.Color;

public class White implements Color {

    @Override
    public void addColor(String carType) {
        System.out.println("白色"+carType);
    }
}
