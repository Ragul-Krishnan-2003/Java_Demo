package Abstraction;
abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public abstract double calculateSalary();
    public abstract void displayInfo();
}
class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}
class Programmer extends Employee {
    private double baseSalary;
    private double overtimeHours;
    private double overtimeRate;

    public Programmer(String name, int id, double baseSalary, double overtimeHours, double overtimeRate) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (overtimeHours * overtimeRate);
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee manager = new Manager("Perumal", 111, 85000, 5500);
        Employee programmer = new Programmer("Doss", 102, 50000, 10, 50);

        manager.displayInfo();
        System.out.println();
        programmer.displayInfo();
    }
}
