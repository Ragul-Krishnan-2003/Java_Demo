package Methodoverloading;
public class DifferentDataType {

    public void displayInfo(int number) {
        System.out.println("Integer: " + number);
    }
    public void displayInfo(String text) {
        System.out.println("String: " + text);
    }

    public static void main(String[] args) {
        DifferentDataType ddf = new DifferentDataType();

        ddf.displayInfo(50);

        ddf.displayInfo("Happy Ayudha poojai" );
    }
}
