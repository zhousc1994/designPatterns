package proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// jdk动态代理，通过反射实现
public class DynamicBuyHouseProxy implements InvocationHandler {

    private Object object;

    public DynamicBuyHouseProxy(Object object){
        this.object = object;
    }

    // 获取代理类
    public Object getProxy(Class tClass){
        Object o = Proxy.newProxyInstance(tClass.getClassLoader(), new Class[]{tClass}, this);
        return o;
    }


    /**
     * 定义代理过程
     * @param proxy
     * @param method
     * @param args
     * @return 代理类
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用buyHouse方法
        Object result = method.invoke(object, args);
        System.out.println("选择房源");
        System.out.println("谈价钱");
        System.out.println("最终敲定购买");
        return result;
    }
}
