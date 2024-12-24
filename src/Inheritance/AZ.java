package Inheritance;
class BZ{
    public void printnum(int i){
        System.out.println("i :" + i);
    }
}
public class AZ extends BZ {
    public void printnum(int j){
        System.out.println("j :" + j);
    }

    public static void main(String[] args) {
        BZ bb = new BZ();
        bb.printnum(12);
        AZ aa2 = new AZ();
        aa2.printnum(200);
    }
}
