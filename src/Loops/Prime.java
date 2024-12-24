package Loops;
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an number");
        int num = scan.nextInt();
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count ++;
            }
        }
        if(count == 2) {
            System.out.println("The number is prime");
        }else{
            System.out.println("not a prime number");
        }
    }
}
