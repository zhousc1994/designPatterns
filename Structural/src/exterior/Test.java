package exterior;

import exterior.entity.Air;
import exterior.entity.Light;
import exterior.entity.Tv;

public class Test {

    public static void main(String[] args) {
        Facade facade = new Facade(new Air(), new Light(), new Tv());
        System.out.println("回家了:");
        facade.open();

        System.out.println("睡觉了:");
        facade.close();
    }
}
