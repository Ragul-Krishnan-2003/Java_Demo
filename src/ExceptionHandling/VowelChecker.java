package ExceptionHandling;

class NoVowelsException extends Exception {
     NoVowelsException(String message) {
        super(message);
    }
}
public class VowelChecker {

    public static void checkVowels(String input) throws NoVowelsException {
        input = input.toLowerCase();
        boolean containsVowel = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                containsVowel = true;
                break;
            }
        }

        if (!containsVowel) {
            throw new NoVowelsException("The string does not contain any vowels.");
        }
    }

    public static void main(String[] args) {
        String[] testStrings = {"hello", "sky", "bcd", "rhythm", "aeiou"};

        for (String str : testStrings) {
            try {
                checkVowels(str);
                System.out.println("The string \"" + str + "\" contains vowels.");
            } catch (NoVowelsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

