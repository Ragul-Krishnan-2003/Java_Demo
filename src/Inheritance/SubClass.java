package Inheritance;

class Parent {
    int i;
    void printI() {
        System.out.println("Value of i: " + i);
    }
}
class Child extends Parent {
    int j;

    void printJ() {
        System.out.println("Value of j: " + j);
    }
}
public class SubClass {
    public static void main(String[] args) {
        Child child = new Child();
        child.i = 10;
        child.j = 20;
        child.printI();
        child.printJ();
    }
}
