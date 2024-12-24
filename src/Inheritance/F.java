package Inheritance;
// single
class G{
    public void methodG(){
        System.out.println("Base class method");
    }
}
public class F extends G {
    public void methodF(){
        System.out.println("Child class method");
    }

    public static void main(String[] args) {
        F obj = new F();
        obj.methodG();
        obj.methodF();
    }
}
