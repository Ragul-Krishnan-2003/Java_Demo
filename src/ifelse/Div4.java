package ifelse;

import java.util.Scanner;

public class Div4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an number");
        int num = scan.nextInt();
        if(num % 4 == 0){
            System.out.println(num + "is divisible by 4");
        }else{
            System.out.println(num + " is not divisible by 4");
        }
    }
}
