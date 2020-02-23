package designPatterns.abstractFactory.entity;

/**
 * 蔬菜披萨
 */
public class VegePizza extends Pizza {

    @Override
    public void ready() {
        System.out.println("准备制作蔬菜披萨");
    }

    @Override
    public void make() {
        System.out.println("制作蔬菜披萨");
    }

    @Override
    public void complete() {
        System.out.println("制作蔬菜披萨完成");
    }
}
