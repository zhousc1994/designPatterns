package exterior;

import exterior.entity.Air;
import exterior.entity.Light;
import exterior.entity.Tv;

/**
 * 外观角色（Facade）： 对客户端接口，用于访问子系统
 */
public class Facade {

    Air air;

    Light light;

    Tv tv;

    public Facade(Air air,Light light, Tv tv){
        this.air = air;
        this.light = light;
        this.tv = tv;
    }

    public void open(){
        air.open();
        light.open();
        tv.open();
    }

    public void close(){
        air.close();
        light.close();
        tv.close();
    }
}
