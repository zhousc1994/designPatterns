package designPatterns.abstractFactory;

import designPatterns.abstractFactory.entity.Milk;
import designPatterns.abstractFactory.entity.Pizza;

/**
 * 抽象工厂模式
 * 只关心产品族，及能创建什么产品族的产品
 */
public interface FactoryInterface {

    Pizza createPizza(String type);

    Milk createMilk(String type);
}
