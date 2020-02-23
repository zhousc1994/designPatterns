package decoration.decorator;

import decoration.Cake;

/**
 *装饰角色（Decorator）：持有一个Component类型的对象引用，它的主要作用就是把客户端的调用委派到被装饰类。
 * 手抓饼装饰类
 */
public class CakeDecorator implements Cake {

    Cake cake;

    // 构造方法是重点，通过构造方法实现装饰
    public CakeDecorator(Cake cake){
        this.cake = cake;
    }

    @Override
    public String nameDetails() {
        return cake.nameDetails();
    }

    @Override
    public double price() {
        return cake.price();
    }
}
