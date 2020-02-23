package designPatterns.singleton;

/**
 * 标准单例
 * 更多相关：concurrentLearning项目
 */
public class Singleton {

    private volatile static Singleton singleton;

    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
