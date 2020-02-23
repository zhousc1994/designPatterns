package designPatterns.factory;

import designPatterns.factory.entity.Pizza;

/**
 * 工厂模式
 * 工厂接口  面向接口编程
 */
public interface Factory {

    Pizza createPizza(String pizzaType);
}
