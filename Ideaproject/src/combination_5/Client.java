package combination_5;

/**
 * Created by Enzo Cotter on 2021/5/23.
 */
public class Client {
    public static void main(String[] args){
        Unit sunnyCompany,company,companyFinance,companyHR,companyShanghai,
                shanghairesearch,shanghaiFinance,shanghaiHR,shenzhenCompany,
                shenzhenresearch,shenzhenFinance,shenzhenHR;
        sunnyCompany = new Company("Sunny公司");

        companyShanghai = new Company("上海分公司");
        shenzhenCompany = new  Company("深圳分公司");

        company = new Department("总公司研发部");
        companyFinance  = new Department("总公司财务部");
        companyHR = new Department("总公司人力资源部");

        shanghairesearch = new Department("上海分公司研发部");
        shanghaiFinance = new Department("上海分公司财务部");
        shanghaiHR = new  Department("上海分公司人力资源部");

        shenzhenresearch = new Department("深圳分公司研发部");
        shenzhenFinance = new  Department("深圳分公司财务部");
        shenzhenHR = new Department("深圳分公司人力资源部");

        sunnyCompany.add(company);
        sunnyCompany.add(companyHR);
        sunnyCompany.add(companyFinance);
        sunnyCompany.add(companyShanghai);
        sunnyCompany.add(shenzhenCompany);

        companyShanghai.add(shanghaiHR);
        companyShanghai.add(shanghaiFinance);
        companyShanghai.add(shanghairesearch);

        shenzhenCompany.add(shenzhenHR);
        shenzhenCompany.add(shenzhenFinance);
        shenzhenCompany.add(shenzhenresearch);

        sunnyCompany.handleNotification();
    }
}
