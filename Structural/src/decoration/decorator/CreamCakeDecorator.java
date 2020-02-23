package decoration.decorator;

import decoration.Cake;

/**
 * 具体装饰角色（Concrete Decorator）
 * 奶油手抓饼
 */
public class CreamCakeDecorator extends CakeDecorator {

    public CreamCakeDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String nameDetails() {
        return "奶油" + super.nameDetails();
    }

    @Override
    public double price() {
        return super.price() + 3.0;
    }
}
