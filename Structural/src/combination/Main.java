package combination;

import combination.composite.ProvincialCompany;
import combination.leaf.LocalCompany;

/**
 * test类
 */
public class Main {

    public static void main(String[] args) {

        Company root = new ProvincialCompany("总公司");
        root.add(new LocalCompany("上海分公司"));

        Company gdCompany =  new ProvincialCompany("广东省分公司");
        gdCompany.add(new LocalCompany("东莞分公司"));
        gdCompany.add(new LocalCompany("佛山分公司"));


        Company hbCompany =  new ProvincialCompany("湖北省分公司");
        hbCompany.add(new LocalCompany("黄冈分公司"));
        hbCompany.add(new LocalCompany("武汉分公司"));

        root.add(gdCompany);
        root.add(hbCompany);

        root.display();

    }
}
