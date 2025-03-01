// Strings Homework (2/28/25)
import java.util.Scanner;

public class ISBNChecker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Takes input from user
        System.out.print("Please enter an ISBN number (13 Digits): ");
        String code = keyboard.next();
        keyboard.close();

        // Checks length of code
        if (code.length() == 13) {
            int sum = 0;

            for (int i = 0; i < 13; i++) {
                int digit = code.charAt(i) - '0'; // Converts the digit into the correct integer

                if (i % 2 == 0) { // iteration is even (0, 2, 4, 6), actual digit is odd
                    sum += digit;
                } else { // iteration is odd (1, 3, 5, 7), actual digit is even
                    sum += 3 * digit;
                }
            }

            // Checks if sum is a factor of 10
            if (sum % 10 == 0) {
                System.out.println("This ISBN number is valid");
            } else {
                System.out.println("This ISBN number is not valid");
            }

        } else {
            System.out.println("The number does not have 13 digits");
        }
    }

}
