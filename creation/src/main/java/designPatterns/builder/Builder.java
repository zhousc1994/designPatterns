package designPatterns.builder;

import designPatterns.builder.entity.Robot;

/**
 * 建造者，定义具体构建的细节
 */
public abstract class Builder {

    public abstract void buildHead();

    public abstract void buildBody();

    public abstract void buildLegs();

    // 获取完工后的产品
    public abstract Robot getRobot();
}
