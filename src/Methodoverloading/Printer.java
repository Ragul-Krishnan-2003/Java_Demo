package Methodoverloading;
public class Printer {
    public void print(int n, char c) {
        System.out.println("Integer: " + n + ", Character: " + c);
    }
    public void print(char c, int n) {
        System.out.println("Character: " + c + ", Integer: " + n);
    }
    public static void main(String[] args) {
        Printer ppp = new Printer();

        ppp.print(11, 'A');

        ppp.print('B', 22);
    }
}

