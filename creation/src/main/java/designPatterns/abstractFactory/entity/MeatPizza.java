package designPatterns.abstractFactory.entity;

/**
 * 肉披萨
 */
public class MeatPizza extends Pizza {
    @Override
    public void ready() {
        System.out.println("准备制作肉披萨");
    }

    @Override
    public void make() {
        System.out.println("制作肉披萨");
    }

    @Override
    public void complete() {
        System.out.println("制作肉披萨完成");
    }
}
