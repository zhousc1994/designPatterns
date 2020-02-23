package decoration;

import decoration.decorator.BeefCakeDecorator;
import decoration.decorator.CreamCakeDecorator;
import decoration.decorator.EggCakeDecorator;

/**
 * test类
 * 采用装饰的方法相对于继承方法：减少了类定义的个数，通过装饰来组合原料，而不需要继承来实现不同的组合关系
 * eg:1,2,3的组合关系有4种（1,2）（1,3）（2,3）（1,2,3）
 * 继承方式需要再增加四个类来实现，而装饰是让客户端自由组合，而且还可以控制组合的顺序！
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("小明要：");

        Cake plainCake = new CakeImpl();  // 需要被装饰的对象
        System.out.println(plainCake.nameDetails() + " $ " + plainCake.price());

        System.out.println("小花要：");
        // 通过构造方法装饰对象
        Cake eggCake= new EggCakeDecorator(plainCake);
        System.out.println(eggCake.nameDetails() + " $ " + eggCake.price());

        System.out.println("张三需要所有配料：");
        //让客户端自由组合，而且还可以控制组合的顺序！
        Cake beefEggCake = new BeefCakeDecorator(eggCake);
        Cake creamBuffEggCake = new CreamCakeDecorator(beefEggCake);
        System.out.println(creamBuffEggCake.nameDetails() + " $ " + creamBuffEggCake.price());
    }
}
