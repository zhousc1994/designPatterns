package combination.composite;

import combination.Company;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合对象(Composite)角色(整体)
 * 通常会存储子组件(组合对象、叶子对象)，定义包含子组件的那些组件的行为，并实现在抽象组件中定义的与子组件有关的操作，
 *      例如子组件的添加(addChild)和删除(removeChild)等。
 * 公司节点，存储下级子公司
 */
public class ProvincialCompany extends Company {

    private List<Company> companyList;

    public  ProvincialCompany(){
        companyList = new ArrayList<>();
    }

    public  ProvincialCompany(String name){
        super(name);
        companyList = new ArrayList<>();
    }

    @Override
    protected void add(Company company) {
        companyList.add(company);
    }

    @Override
    protected void remove(Company company) {
        companyList.remove(company);
    }

    @Override
    public void display() {
        System.out.println(this.getName()+"  下的子公司");

        for (Company company : companyList){
            company.display();
        }
    }
}
