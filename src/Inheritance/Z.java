package Inheritance;
//multilevel
class X{
    public void methodX(){
        System.out.println("class x method");
    }
}
class Y extends X{
    public void methodY(){
        System.out.println("class y method");
    }
}
public class Z extends Y {
    public void methodZ(){
        System.out.println("class z method");
    }

    public static void main(String[] args) {
        Z obj = new Z();
        obj.methodX();
        obj.methodY();
        obj.methodZ();
    }
}
