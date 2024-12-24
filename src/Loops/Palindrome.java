package Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an number");
        int num = scan.nextInt();
        int originalNum = num;
        int reverseNum = 0;
        while(num != 0){
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        if(originalNum == reverseNum){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not a palindrome");
        }
    }
}
