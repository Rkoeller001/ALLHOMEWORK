package homework10119;

public class SalariedEmployee extends Employee{
    public int weeklySalary;

    public SalariedEmployee(String firstName, String lastName, int employeeId,int weeklySalary) {
        super(firstName, lastName, employeeId);
        this.weeklySalary = weeklySalary;
    }

    public void payCheck(){
        System.out.println(weeklySalary);
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                '}';
    }
}
