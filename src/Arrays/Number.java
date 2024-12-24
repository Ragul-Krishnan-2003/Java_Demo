package Arrays;

public class Number {
    public static void main(String[] args) {
        int [] x = new int[5];
        x[0] = 3;
        x[1] = 5;
        x[2] = 6;
        x[3] = 1;
        x[4] = 123;
        for(int i = 0; i < x.length; i ++){
            System.out.println("x["+i+"]:" + x[i]);
        }
    }
}
