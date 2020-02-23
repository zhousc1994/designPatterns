package designPatterns.builder.entity;

/**
 * 要生产的机器人产品
 */
public class Robot {

    private String head;

    private String body;

    private String legs;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", legs='" + legs + '\'' +
                "机器人建造完成}";
    }
}
