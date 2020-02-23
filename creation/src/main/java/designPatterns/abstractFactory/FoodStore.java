package designPatterns.abstractFactory;

import designPatterns.abstractFactory.factoryImpl.ColdFoodFactory;
import designPatterns.abstractFactory.factoryImpl.HotFoodFactory;

/**
 * 服务商店，消费食物
 */
public class FoodStore {
    /**
     * 消费食物
     * @param foodType  食物类型
     * @param productType  单个产品的类型
     * @param type      特性：熟食和生食
     */
    public static void consume(String foodType,String productType,String type){
        if("pizza".equals(foodType)){
            if ("cold".equals(type)){
                ColdFoodFactory coldFoodFactory = new ColdFoodFactory();
                coldFoodFactory.createPizza(productType);
            }
            if ("hot".equals(type)){
                HotFoodFactory hotFoodFactory = new HotFoodFactory();
                hotFoodFactory.createPizza(productType);
            }
        }

        if("milk".equals(foodType)){
            if ("cold".equals(type)){
                ColdFoodFactory coldFoodFactory = new ColdFoodFactory();
                coldFoodFactory.createMilk(productType);
            }
            if ("hot".equals(type)){
                HotFoodFactory hotFoodFactory = new HotFoodFactory();
                hotFoodFactory.createMilk(productType);
            }
        }
    }

    public static void main(String[] args) {
        consume("pizza","vege","hot");
    }
}
