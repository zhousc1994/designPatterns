package flyweight.impl;

import flyweight.BottleCap;

/**
 * 具体享元类，他关注我们的整体，对于共享部分自己处理，对于非共享部分，引入非共享部门负责类
 */
public class OkCap implements BottleCap {

    String color;

    BottleCap bottleCap;

    public OkCap(String color,BottleCap bottleCap){
        this.color = color;
        this.bottleCap = bottleCap;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    // 享元模式最终想要的对象是一个内部状态+外部状态的完整对象
    @Override
    public String getCode(String different) {
        if (bottleCap != null)
        return bottleCap.getCode(different);
        return "无法打印";
    }
}
