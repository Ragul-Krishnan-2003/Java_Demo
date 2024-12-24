package ifelse;
import java. util.*;
public class Pooja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Date of ayudha pooja");
        int num = scan.nextInt();

        if(num > 10){
            System.out.println("Happy ayudha poojai");
        }else {
            System.out.println("Enter the correct number ");
        }
    }
}
