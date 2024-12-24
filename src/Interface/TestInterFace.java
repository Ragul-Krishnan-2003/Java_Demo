package Interface;

interface Printable{
    void print();
    }

interface Showable{
    void print();
}
public class TestInterFace implements Printable,Showable {
    public void print(){
        System.out.println("Hi");
    }
    public static void main(String[] ars){
        TestInterFace obj = new TestInterFace();
        obj.print();
    }

}
