package proxy.dynamic;

import proxy.dynamic.jdk.DynamicBuyHouseProxy;
import proxy.statics.BuyHouse;
import proxy.statics.impl.BuyHouseImpl;

public class Test {

    public static void main(String[] args) {
        BuyHouseImpl buyHouse = new BuyHouseImpl();

        DynamicBuyHouseProxy dynamicBuyHouseProxy = new DynamicBuyHouseProxy(buyHouse);

        // 获取代理类
        BuyHouse proxy = (BuyHouse)dynamicBuyHouseProxy.getProxy(BuyHouse.class);

        // 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用。
        proxy.buyHouse();
    }
}
