package proxy.statics.impl;

import proxy.statics.BuyHouse;

// RealSubject(真实角色): 它代表着真实对象，是我们最终要引用的对象
public class BuyHouseImpl implements BuyHouse {

    @Override
    public void buyHouse() {
        System.out.println("我要买房子");
    }
}
