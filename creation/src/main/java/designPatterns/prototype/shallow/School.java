package designPatterns.prototype.shallow;

import java.io.Serializable;

public class School implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    protected School clone() throws CloneNotSupportedException {
//        return (School) super.clone();
//    }
}
