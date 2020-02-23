package designPatterns.factory.service;

import designPatterns.factory.Factory;
import designPatterns.factory.entity.MeatPizza;
import designPatterns.factory.entity.Pizza;
import designPatterns.factory.entity.VegePizza;

import java.text.NumberFormat;
import java.util.Calendar;

/**
 * 工厂类的具体实现，由实现类来决定创建pizza的规则
 */
public class PizzaStore implements Factory {


    @Override
    public Pizza createPizza(String pizzaType) {
        if ("vege".equals(pizzaType)){
            return new VegePizza();
        }
        if ("meat".equals(pizzaType)){
            return new MeatPizza();
        }
        return null;
    }

    /**
     * 准备pizza
     */
    public Pizza orderPizza(String pizzaType){
        System.out.println("开始准备制作PIzza");
        Pizza pizza = createPizza(pizzaType);
        pizza.ready();
        pizza.make();
        pizza.complete();
        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("vege");
    }
}
