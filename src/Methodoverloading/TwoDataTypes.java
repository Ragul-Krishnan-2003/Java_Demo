package Methodoverloading;
public class TwoDataTypes {

    public void display(int number) {
        System.out.println("Integer value: " + number);
    }

    public void display(float number) {
        System.out.println("Float value: " + number);
    }

    public static void main(String[] args) {
        TwoDataTypes tdt = new TwoDataTypes();

        tdt.display(5);
        tdt.display(2.3f);
    }
}
