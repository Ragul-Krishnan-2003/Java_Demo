package ifelse;

public class Narrowing {
    public static void main(String[] args) {
        int a = 130;
        byte b = (byte) a;
        System.out.println(b);
    }
}
