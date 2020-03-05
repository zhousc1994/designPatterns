package proxy.dynamic.cglib;


/**
 * 需要代理的目标类
 */
public class Dog {

    public void eat(String name){
        System.out.println("狗："+ name + " 正在吃东西");
    }
}
