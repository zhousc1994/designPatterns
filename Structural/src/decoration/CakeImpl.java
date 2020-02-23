package decoration;

/**
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
