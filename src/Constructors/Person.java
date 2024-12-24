package Constructors;// Default constructor
class Stranger {
    String name;
    int age;

    Stranger() {
        name = "Parthiban";
        age = 49;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Person {
    public static void main(String[] args) {
        Stranger pp = new Stranger();
        pp.display();
    }
}

