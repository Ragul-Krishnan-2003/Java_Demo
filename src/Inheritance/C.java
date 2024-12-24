package Inheritance;
// Multilevel inheritance
class D{
    void print(){
        System.out.println("This is a parent ");
    }
}
class E extends D{
    void print(){
        System.out.println("Child class");
    }
}
public class C extends E{
    public static void main(String[] args) {
        D obj = new D();
        obj.print();
    }
}
