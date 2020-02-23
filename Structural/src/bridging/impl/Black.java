package bridging.impl;

import bridging.Color;

public class Black implements Color {

    @Override
    public void addColor(String carType) {
        System.out.println("黑色"+carType);
    }
}
