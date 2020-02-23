package combination;

/**
 * 抽象组件(Component)角色
 * 组合对象和叶子对象声明公共接口，声明一个接口用于访问和管理Component的子组件
 * 定义公司抽象类
 */
public abstract class Company {

    private String name;

    public Company(String name) {
        this.name = name;
    }

    public Company(){

    }

    protected abstract void add(Company company);

    protected abstract void remove(Company company);

    // 展示公司结构
    public abstract void display();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
