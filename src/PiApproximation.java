
// Loops Homework (2/25/25)
import java.util.Scanner;

public class PiApproximation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double sum = 0; 
        int n;
        char response;
        
        // Loop to calculate
        do {
            // Prompts user for an n value
            System.out.print("Please enter an n value: ");
            n = keyboard.nextInt();
            
            // Calculates the sum 
            for (int i = 0; i < n; i++) {
                sum += Math.pow(-1, i) / (2 * i + 1);
            }

            // Calculates and prints the approximate pi
            double pi = 4 * sum;
            System.out.println("The approximate value of pi is: " + pi);

            // Prompts user if they want to repeat the calculation
            System.out.print("Do you to try again? (y/n): ");
            response = keyboard.next().toLowerCase().charAt(0);
        } while (response == 'y'); // If the user says yes, do again, else break

        keyboard.close();
    }
}
