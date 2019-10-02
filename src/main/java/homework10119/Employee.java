package homework10119;

public class Employee {
    private String firstName;
    private String lastName;
    private int employeeId;

    public Employee(String firstName,String lastName,int employeeId){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void payCheck(){

    }


    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }
}
