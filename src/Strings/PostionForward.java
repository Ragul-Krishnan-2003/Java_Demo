package Strings;
import java.util.*;
public class PostionForward {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a lower case Letter:");
        char inputChar = scan.next().charAt(0);
        char newChar = (char) (inputChar + 10);

        if( (int) newChar > 26){
            newChar = (char) (newChar - 26);
        }
        System.out.println("The letter 10 position forward is :" + newChar);
    }
}
