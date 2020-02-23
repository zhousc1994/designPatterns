package bridging;

/**
 * Abstraction（抽象类）:桥接模式目的是为了建立抽象类的对象，与另一接口建立关联关系
 */
public abstract class Car {

    /**
     * 关联关系，使用接口的方式实现关联关系
     * 1.关联关系（弱关联，使用接口的方式降低耦合性），新增颜色只需实现接口
     */
    private Color color;


    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract void makeCar();
}
