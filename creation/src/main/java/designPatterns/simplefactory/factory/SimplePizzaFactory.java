package designPatterns.simplefactory.factory;

import designPatterns.simplefactory.entity.MeatPizza;
import designPatterns.simplefactory.entity.Pizza;
import designPatterns.simplefactory.entity.VegePizza;

/**
 * 简单的披萨工厂  核心  用于制造不同种类的pizza
 * 新增一种产品，就需要新增一段if判断，不方便扩展
 */
public class SimplePizzaFactory {

    public Pizza create(String pizzaType){
        Pizza pizza = null;
        if ("Vege".equals(pizzaType)){
            pizza = new VegePizza();
        }
        if ("Meat".equals(pizzaType)){
            pizza = new MeatPizza();
        }
        return pizza;
    }
}
