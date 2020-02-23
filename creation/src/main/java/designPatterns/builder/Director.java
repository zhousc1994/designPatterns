package designPatterns.builder;

import designPatterns.builder.entity.Robot;

/**
 * 指挥者：用于控制各个部件的构建顺序
 */
public class Director {

    // 指挥者构建机器人
    public Robot create(Builder builder){
        builder.buildHead();
        builder.buildBody();
        builder.buildLegs();
        return builder.getRobot();
    }
}
