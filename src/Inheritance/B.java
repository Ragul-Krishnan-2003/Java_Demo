package Inheritance;
//Single inheritance
class A{
    void print(){
        System.out.println("This is a parent Class");
    }
        }
public class B extends A{
    public static void main(String[] args) {
        A aa = new A();
        aa.print();
        B aa1 = new B();
        aa1.print();
    }
}
