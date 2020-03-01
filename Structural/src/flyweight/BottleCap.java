package flyweight;

// 抽象享元类 里面包含了共享的状态和非共享状态
public interface BottleCap {

    // 内部状态
    String getColor();

    // 外部状态
    String getCode(String different);
}
