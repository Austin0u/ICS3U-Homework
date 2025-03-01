// Loops Homework (2/25/25)
import java.util.Scanner;

public class PiApproximation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char response;

        // Loop to calculate
        do {
            // Prompts user for an n value
            System.out.print("Please enter an n value: ");
            int n = keyboard.nextInt();
            double sum = 0; // Resets sum

            // Calculates the sum
            for (int i = 0; i < n; i++) {
                sum += Math.pow(-1, i) / (2 * i + 1);
            }

            // Calculates and prints the approximate pi
            System.out.println("The approximate value of pi is: " + 4 * sum);

            // Prompts user if they want to repeat the calculation
            System.out.print("Do you to try again? (y/n): ");
            response = keyboard.next().toLowerCase().charAt(0);
        } while (response == 'y'); // If the user says yes, do again, else break

        keyboard.close();
    }
}
