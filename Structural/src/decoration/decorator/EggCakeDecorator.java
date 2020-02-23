package decoration.decorator;

import decoration.Cake;

/**
 * 体装饰角色（Concrete Decorator）
 * 鸡蛋手抓饼
 */
public class EggCakeDecorator extends CakeDecorator {

    public EggCakeDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String nameDetails() {
        return "鸡蛋" + super.nameDetails();
    }

    @Override
    public double price() {
        return super.price() + 1.5;
    }
}
