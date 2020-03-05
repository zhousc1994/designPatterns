package proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Test {

    public static void main(String[] args) {
        //创建Enhancer对象，类似于JDK动态代理的Proxy类
        Enhancer enhancer = new Enhancer();

        // 设置目标类
        enhancer.setSuperclass(Dog.class);

        // 设置回调函数
        enhancer.setCallback(new MyMethodInterceptor());

        // 创建代理类
        Dog proxyDog = (Dog)enhancer.create();

        // 调用代理类的eat方法
        proxyDog.eat("小洪");
    }
}
