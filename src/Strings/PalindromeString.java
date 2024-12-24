package Strings;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");

        String str = scan.nextLine();

        String originalStr = str;

        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        if (reversedStr.equals(originalStr)) {
            System.out.println(originalStr + " is a palindrome.");
        } else {
            System.out.println(originalStr + " is not a palindrome.");
        }
    }
}
