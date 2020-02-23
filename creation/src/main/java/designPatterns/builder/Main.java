package designPatterns.builder;

import designPatterns.builder.entity.Robot;
import designPatterns.builder.impl.RobotBuilder;

/**
 * Test类
 */
public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        Robot robot = director.create(new RobotBuilder());
        System.out.println(robot);
        //结果：Robot{head='头部', body='身体', legs='双腿'机器人建造完成}
    }
}
