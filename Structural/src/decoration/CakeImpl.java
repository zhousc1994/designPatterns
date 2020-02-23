package decoration;

/**
 * 具体构件角色（Concrete Component）：就是那个被装饰的类。
 * 具体手抓饼（原味）
 */
public class CakeImpl implements Cake {
    @Override
    public String nameDetails() {
       return "原味手抓饼";
    }

    @Override
    public double price() {
        return 5;
    }
}
