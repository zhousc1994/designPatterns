package proxy.statics;

// 代理角色：代理对象与真实对象实现相同接口，所有它能够代理真实对象，代理对象包含真实对象的引用
public class BuyHouseProxy implements BuyHouse {
    // 代理对象包含真实对象的引用
    private BuyHouse buyHouse;

    public BuyHouseProxy(BuyHouse buyHouse){
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        buyHouse.buyHouse();
        System.out.println("选择房源");
        System.out.println("谈价钱");
        System.out.println("成交");
    }
}
