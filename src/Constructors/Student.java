package Constructors;

public class Student { // parameterised constructor
    String name;
    Student(String name){
        this.name = name;
    }
    Student(){
                    // No arguments
    }

    public void getName(){
        if(name==null){
            System.out.println("Unknown");
        }
        else{
            System.out.println(name);
        }
    }
    public static void main(String[] args){
        Student obj = new Student("Ragul");
        Student obj2 = new Student();
        obj.getName();
        obj2.getName();
    }
}
