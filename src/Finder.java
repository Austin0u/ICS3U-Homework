import java.util.Scanner;

public class Finder {
    // private static boolean checkForNumbers(String value) {
    // for (int i = 0; i < value.length(); i++) {
    // if ()
    // }
    // }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Takes input from user
        System.out.print("Please enter ");
        String code = keyboard.next();
        keyboard.close();

        // Checks length of code
        if (code.length() == 13) {
            int sum = 0;

            for (int i = 0; i < 13; i++) {
                char digit = code.charAt(i);

                if (i % 2 == 0) { // iteration is even (0, 2, 4, 6)
                    sum += (int) digit * 3;
                } else { // iteration is odd (1, 3, 5, 7)
                    sum += (int) digit;
                }
            }

            // Checks if divisible by
            if (sum % 10 == 0) {
                System.out.println("Your code is a valid number");
            } else {
                System.out.println("Your code is not a valid number");
            }

        } else {
            System.out.println("Your code does not have 13 digits");
        }
    }

}
