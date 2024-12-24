package Inheritance;
public class Member {
    int age;
    String name,address,mobile;
    int salary;
    public void printSalary(int salary){
        this.salary = salary;
        System.out.println("Salary :" + this.salary);
    }
    public static void main(String [] args){
        Member mm = new Member();
        Employee ee = new Employee();
        ee.print("Ragul" , 20, "Coimbatore" , "9384922165", "Software Developer" );
        mm.printSalary(30000);
        Manager mn = new Manager();
        mn.print("Das",35,"Chennai","7708175162","TL");
        mm.printSalary(120000);
    }
}
class Employee extends Member{
    String role;
    public void print(String name, int age ,String address,String mobile,String role){
        System.out.println(" Employee Details ");
        this.role = role;
        System.out.println("Name :" + name);
        System.out.println("Age:" + age);
        System.out.println("Address:" + address);
        System.out.println("Mobile:" + mobile);
        System.out.println("Role:"+ role );

    }
}
class Manager extends Member{
    String specialization;
    public void print(String name,int age,String address,String mobile,String specialization){
        System.out.println("Manager Details");
        System.out.println("Name :" + name);
        System.out.println("Age:" + age);
        System.out.println("Address:" + address);
        System.out.println("Mobile:" + mobile);
        System.out.println("Specialization:" + this.specialization);
    }
}