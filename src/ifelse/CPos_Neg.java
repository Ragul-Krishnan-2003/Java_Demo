package ifelse;

import java.util.Scanner;

public class CPos_Neg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an number");
        int num = scan.nextInt();
        if(num < 0){
            System.out.println("The number is negative");
        }else{
            System.out.println("The number is positive");
        }
    }
}
