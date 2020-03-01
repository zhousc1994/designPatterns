package flyweight;

import flyweight.impl.OkCap;

import java.util.HashMap;
import java.util.Map;

/**
 * CapFactory 并不是制造工厂，它是提供了一个享元池工厂，用于维护我们的享元池
 */
public class CapFactory {

    private static Map<String,BottleCap> map = new HashMap<>();


    public static BottleCap getBottleCap(String color,BottleCap bottleCap){

        if (map.get(color) != null){
            return map.get(color);
        }
        BottleCap okCap = new OkCap(color, bottleCap);
        map.put(color,okCap);
        return okCap;
    }
}
