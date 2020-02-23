package designPatterns.abstractFactory.factoryImpl;

import designPatterns.abstractFactory.FactoryInterface;
import designPatterns.abstractFactory.entity.*;

/**
 * 这个工厂生产的是一个产品族，包含了牛奶和披萨，这个产品族的等级结构是 hot
 * 因为不同等级结构产品制作方式上有所区别，所以制作流程会出现在我们的具体工厂里面
 */
public class HotFoodFactory implements FactoryInterface {
    @Override
    public Pizza createPizza(String type) {
        if ("vege".equals(type)){
            VegePizza vegePizza = new VegePizza();
            vegePizza.ready();
            vegePizza.make();
            vegePizza.complete();
            return vegePizza;
        }
        if ("meat".equals(type)){
            MeatPizza meatPizza = new MeatPizza();
            meatPizza.ready();
            meatPizza.make();
            meatPizza.complete();
            return meatPizza;
        }
        return null;
    }

    @Override
    public Milk createMilk(String type) {
        if ("apple".equals(type)){
            AppleMilk appleMilk = new AppleMilk();
            appleMilk.ready();
            appleMilk.make();
            appleMilk.complete();
            return appleMilk;
        }
        if ("banana".equals(type)){
            BananaMilk meatPizza = new BananaMilk();
            meatPizza.ready();
            meatPizza.make();
            meatPizza.complete();
            return meatPizza;
        }
        return null;
    }
}
