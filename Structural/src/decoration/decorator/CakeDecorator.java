package decoration.decorator;

import decoration.Cake;

/**
 * 手抓饼装饰类
 */
public class CakeDecorator implements Cake {

    Cake cake;

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
