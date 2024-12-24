package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "I am Studied in postulate";
        String reversestring = "";

        for(int i =str.length()-1; i >= 0; i--){
            reversestring = reversestring + str.charAt(i);
        }
        System.out.println("reversestring of the value is :" + reversestring);
    }
}
