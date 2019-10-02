package homework10119;

public class BasePlusEmployee extends  CommissionedEmployee {
    public int baseSalary;
    public BasePlusEmployee(String firstName, String lastName, int employeeId, float commissionRate, double grossSales,int baseSalary) {
        super(firstName, lastName, employeeId, commissionRate, grossSales);
        this.baseSalary = baseSalary;
    }
    public void payCheck(){
        System.out.println(commissionRate * grossSales + baseSalary);
    }

    @Override
    public String toString() {
        return "BasePlusEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }
}
