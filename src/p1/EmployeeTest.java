package p1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(222,"Abts",2800.0);
        Employee employee2 = new Employee(2);

        employee1.displayInfo();
        employee2.displayId();
        employee2.displaySalary();
    }
}
