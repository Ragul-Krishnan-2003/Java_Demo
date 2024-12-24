package Encapsulation;

public class EncapsulationDemo {
    private String Name;
    private int RollNo;
    private int Age;

    public String getName(){
        return Name;
    }

    public int getRollNo(){
        return RollNo;
    }
    public int getAge(){
        return Age;
    }
    public void setName(String newName){
        Name = newName;
    }
    public void setRollNo(int newRollNo){
        RollNo = newRollNo;
    }
    public void setAge(int newAge){
        Age = newAge;
    }

    public static void main(String[] args) {
        EncapsulationDemo dd = new EncapsulationDemo();
        dd.setName("Gandhi");
        dd.setRollNo(21);
        dd.setAge(55);
        System.out.println("Student's Name: " + dd.getName());
        System.out.println("Student's RollNo: " + dd.getRollNo());
        System.out.println("Student's Age: " + dd.getAge());
    }
}
