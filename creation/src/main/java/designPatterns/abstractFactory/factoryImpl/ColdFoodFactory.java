package designPatterns.abstractFactory.factoryImpl;

import designPatterns.abstractFactory.FactoryInterface;
import designPatterns.abstractFactory.entity.*;

/**
 * 这是一个生食物的产品族，包含牛奶和披萨，这个产品族的等级是cold
 */
public class ColdFoodFactory implements FactoryInterface {
    @Override
    public Pizza createPizza(String type) {
        if ("vege".equals(type)){
            VegePizza vegePizza = new VegePizza();
            vegePizza.ready();
            vegePizza.complete();
            return vegePizza;
        }
        if ("meat".equals(type)){
            MeatPizza meatPizza = new MeatPizza();
            meatPizza.ready();
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
            appleMilk.complete();
            return appleMilk;
        }
        if ("banana".equals(type)){
            BananaMilk meatPizza = new BananaMilk();
            meatPizza.ready();
            meatPizza.complete();
            return meatPizza;
        }
        return null;
    }
}
