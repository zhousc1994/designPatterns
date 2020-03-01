package flyweight.impl;

import flyweight.BottleCap;

// 非共享部门的子类，他关注于我们的非共享部分
public class NoCap implements BottleCap {

    @Override
    public String getColor() {  // 非共享具体享元类不需要考虑内部状态
        return null;
    }

    /**
     * 传入different ，是为了客户端调用，也是为了对code进行特异处理
     * @param different
     * @return
     */
    @Override
    public String getCode(String different) {
        return different + "制作完成";
    }
}
