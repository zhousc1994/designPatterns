package designPatterns.builder.impl;

import designPatterns.builder.Builder;
import designPatterns.builder.entity.Robot;

/**
 * 建造工人（具体建造者）
 */
public class RobotBuilder extends Builder {
    private Robot robot;

    public RobotBuilder(){
        robot = new Robot();
    }

    @Override
    public void buildHead() {
        //一系列复杂构建过程（省略）
        robot.setHead("头部");
    }

    @Override
    public void buildBody() {
        robot.setBody("身体");
    }

    @Override
    public void buildLegs() {
        robot.setLegs("双腿");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
