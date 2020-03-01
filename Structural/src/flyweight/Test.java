package flyweight;

import flyweight.impl.NoCap;

public class Test {

    public static void main(String[] args) {

        //1. 简单享元模式 （不考虑外部状态）
        BottleCap cap1 = CapFactory.getBottleCap("红色", null);
        BottleCap cap2 = CapFactory.getBottleCap("绿色", null);
        BottleCap cap3 = CapFactory.getBottleCap("蓝色", null);
        System.out.println(cap1.getColor());
        System.out.println(cap1.getCode("二维码"));

        BottleCap cap4 = CapFactory.getBottleCap("红色", null);  // 共享对象，与cap1指向同一对象

        //2.享元模式  考虑我们的外部状态
        System.out.println("========================================");
        BottleCap cap5 = CapFactory.getBottleCap("www色", new NoCap());
        System.out.println(cap5.getColor());
        System.out.println(cap5.getCode("李四的二维码"));
    }
}
