package p1;

public class Employee {
    private int id;
    public String sureName;
    private double salary;

    public Employee(int id, String sureName, double salary) {
        this.id = id;
        this.sureName = sureName;
        this.salary = salary;
    }

    Employee(int id) {
        this.id = id;
    }
    private Employee() {
    }

    public void displayId() {
        System.out.println("ID: " + id);
        System.out.println("Surename: " + sureName);
        System.out.println("Salary: " + salary);
    }
}
