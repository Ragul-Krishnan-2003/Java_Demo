package Loops;
import java.util.*;
public class PrimeRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an starting range");
        int sum = scan.nextInt();
        System.out.println("Enter an ending range");
        int num = scan.nextInt();

        for(int i = sum; i <= num; i ++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 10){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(i + " the number is prime ");
            }else{
                System.out.println(i + " the number is not prime");
            }
        }
    }
}
