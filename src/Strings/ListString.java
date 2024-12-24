package Strings;


public class ListString {
    public static void main(String[] args) {

        String str = "Ragul, java";

        System.out.println("Length: " + str.length());

        // Print character at position 3
        System.out.println("Char: " + str.charAt(3));

        // Print substring from index 1 to 3
        System.out.println("Substring: " + str.substring(1, 3));

        // Print index of the substring "java"
        System.out.println("Index: " + str.indexOf("java"));

        // Print string in lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Print string in uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Print trimmed string (no effect in this case)
        System.out.println("Trimmed: " + str.trim());

        // Replace "Ragul" with "ragul" in the string
        System.out.println("Replaced: " + str.replace("Ragul", "ragul"));

        // Check if string starts with "j"
        System.out.println("Starts with 'j': " + str.startsWith("j"));

        // Convert string to character array and print each character
        char[] charArray = str.toCharArray();
        System.out.print("Char array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Check if string equals "Ragul, java"
        System.out.println("Equals 'Ragul, java': " + str.equals("Ragul, java"));

        // Split the string by comma and print each part
        String[] parts = str.split(", ");
        System.out.println("Split by comma:");
        for (String part : parts) {
            System.out.println(part);
        }

        System.out.println("Concat: " + str.concat(" Ragul"));

        System.out.println("Contains 'java': " + str.contains("java"));
    }
}
