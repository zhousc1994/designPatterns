package designPatterns.abstractFactory.entity;

public class AppleMilk extends Milk {
    @Override
    public void ready() {
        System.out.println("准备制作苹果味牛奶");
    }

    @Override
    public void make() {
        System.out.println("制作苹果味牛奶");
    }

    @Override
    public void complete() {
        System.out.println("制作苹果味牛奶完成");
    }
}
