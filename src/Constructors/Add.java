package Constructors;

public class Add {
    Add(int a, int b) {
        System.out.println(a + b);
    }

    Add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Add aa = new Add(2, 3);
        Add aa2 = new Add(3, 3, 5);

    }
}
