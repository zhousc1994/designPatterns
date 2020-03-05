package proxy.statics;

import proxy.statics.impl.BuyHouseImpl;

public class Test {

    public static void main(String[] args) {
        System.out.println("==============没使用代理=============");
        BuyHouseImpl buyHouse = new BuyHouseImpl();
        buyHouse.buyHouse();

        System.out.println("=============使用代理=============");
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHouse();
    }
}
