package Loops;
import java.util.*;
public class Multiple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Number: ");
        int m = scan.nextInt();

        for(int x = 1; x <= 10; x++){
            System.out.println(m + "*" + x + "=" + (m*x));
        }
    }
}
