package designPatterns.abstractFactory.entity;

public class BananaMilk extends Milk {

    @Override
    public void ready() {
        System.out.println("准备制作香蕉味牛奶");
    }

    @Override
    public void make() {
        System.out.println("制作香蕉味牛奶");
    }

    @Override
    public void complete() {
        System.out.println("制作香蕉味牛奶完成");
    }
}
