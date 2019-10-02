package homework10119;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new SalariedEmployee("steven","stan",3012,30);
        System.out.println(employee1);
        Employee employee2 = new CommissionedEmployee("spam","dinner",3065,25.0f,2500.00);
        System.out.println(employee2);
        Employee employee3 = new BasePlusEmployee("chris","edge",2087,12.0f,40.00,45000);
        System.out.println(employee3);


    }
    public static void payCheck(SalariedEmployee salariedEmployee,BasePlusEmployee basePlusEmployee,CommissionedEmployee commissionedEmployee){
        if (basePlusEmployee != null){
            System.out.println(basePlusEmployee.toString());
        }else if (commissionedEmployee != null ){
            System.out.println(commissionedEmployee.toString());
        }else{
            System.out.println(salariedEmployee.toString());
        }

    }
}
