// Strings Homework (2/28/25) 
import java.util.Scanner;

public class ISBNChecker {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter an ISBN number:");
        String isbn = keyboard.next();
        int sum = 0;
        keyboard.close();

        if (isbn.length() != 13) {
            System.out.println("The ISBN number is not 13-digits!");
        } else {
            for (int i = 0; i < isbn.length(); i++) {
                if (!Character.isDigit(isbn.charAt(i))) {
                    System.out.println("The ISBN contains non-digits!");
                    System.exit(1);
                }
                int digit = Character.getNumericValue(isbn.charAt(i));
                sum += (i % 2 == 0) ? digit : digit * 3;
            }
            System.out.println("ISBN number is valid: " + (sum % 10 == 0));
        }
    }
}