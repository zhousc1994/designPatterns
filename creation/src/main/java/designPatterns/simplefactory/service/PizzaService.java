package designPatterns.simplefactory.service;

import designPatterns.simplefactory.entity.Pizza;
import designPatterns.simplefactory.factory.SimplePizzaFactory;

/**
 * 消费披萨
 */
public class PizzaService {

    private SimplePizzaFactory pizzaFactory;

    public PizzaService(SimplePizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    /**
     * 制作不同种类的pizza
     */
    public void makePizza(String pizzaType){
        System.out.println("开始消费pizza");

        Pizza pizza = pizzaFactory.create(pizzaType);
        pizza.ready();
        pizza.make();
        pizza.complete();
    }

    /**
     * 测试
     */
    public static void main(String[] args) {
        PizzaService pizzaService = new PizzaService(new SimplePizzaFactory());
        pizzaService.makePizza("Meat");
    }
}
