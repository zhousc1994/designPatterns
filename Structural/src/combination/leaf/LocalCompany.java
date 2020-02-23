package combination.leaf;

import combination.Company;

/**
 * 叶子对象(Leaf)角色（部分）
 * 定义和实现叶子对象的行为，并且它不再包含其他的子节点对象。
 * 地级公司，无子节点
 */
public class LocalCompany extends Company {

    public LocalCompany(String name){
        super(name);
    }

    @Override
    protected void add(Company company) {

    }

    @Override
    protected void remove(Company company) {

    }

    @Override
    public void display() {
        System.out.println(this.getName());
    }
}
