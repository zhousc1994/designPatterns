# java 设计模式

## 一.创建型模式

[1.工厂模式](./creation/工厂模式.md)

[2.创建者模式](./creation/创建者模式.md)

[3.原型模式](./creation/原型模式.md)

## 二.结构型模式

[1.适配器模式](./Structural/src/adapter/适配器.md)

[2.桥接模式](./Structural/src/bridging/桥接模式.md)

[3.组合模式](./Structural/src/combination/组合模式.md)

[4.装饰者模式](./Structural/src/decoration/装饰者模式.md)

[5.外观模式](./Structural/src/exterior/外观模式.md)

[6.享元模式](./Structural/src/flyweight/享元模式.md)

[7.代理模式](./Structural/src/proxy/代理模式.md)

### 总结
    适配器： 接口兼容问题
    桥接： 桥接属性，构建不同维度的对象
    组合：忽略 整体-部分细节，创建层级分明的对象
    装饰：动态的为已有接口添加新的行为
    外观：通过对外接口方便访问子系统
    享元：共享对象部分相似特征，优化内存，高度重用
    代理：通过代理对象完成对目标对象方法调用，并可在代理对象中添加行为