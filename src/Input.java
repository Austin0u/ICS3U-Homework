
// Primitive Data Types Homework (2/7/25)
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner object

        // Prompt the user for decimal
        System.out.print("Enter a decimal (double): ");
        /*
         * Alternatively, you can use the following methods to read the input as an
         * integer:
         * 
         * 1. Store as double and cast as integer in new variable:
         * double input = keyboard.nextDouble(); // Read the input (double)
         * int integer = (int) input; // Cast the input as an integer
         * 
         * 2. Store as a double and cast as an interger in the print statement:
         * double input = keyboard.nextDouble(); // Read the input (double)
         * 
         * System.out.println("Your input (double) as an integer is " + (int) input);
         */

        // Output the user input
        System.out.println("Your input (double) as an integer is " + (int) scanner.nextDouble());
        scanner.close();
    }
}