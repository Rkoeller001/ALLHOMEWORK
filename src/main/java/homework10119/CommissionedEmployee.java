package homework10119;

public class CommissionedEmployee extends Employee {
    public float commissionRate;
    public double grossSales;

    public CommissionedEmployee(String firstName, String lastName, int employeeId,float commissionRate,double grossSales) {
        super(firstName, lastName, employeeId);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }
    public void payCheck(){
        System.out.println(commissionRate * grossSales);
    }

    @Override
    public String toString() {
        return "CommissionedEmployee{" +
                "commissionRate=" + commissionRate +
                ", grossSales=" + grossSales +
                '}';
    }
}
