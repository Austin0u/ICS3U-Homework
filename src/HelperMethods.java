
// Methods Homework (3/17/25)
import java.util.Scanner;

public class HelperMethods {
    public static void quadraticFormula(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - (4 * a * c); // Calculates the discriminant

        // Calculate each root and return as array
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a); // Value for root 1
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a); // Value for root 2

        if (discriminant == 0) { // One real root
            System.out.println("Your only root is: " + (-b / (2 * a))); // Value for singular root
        } else if (discriminant > 0) { // Two real roots
            System.out.println("Your first root is: " + root1);
            System.out.println("Your second root is: " + root2);
        } else {
            System.out.println("There are no real roots.");
        }
    }

    public static double piApproximation(int n) {
        double sum = 0; // Resets sum

        // Calculates the sum
        for (int i = 0; i < n; i++) {
            sum += Math.pow(-1, i) / (2 * i + 1);
        }

        return 4 * sum;
    }

    public static void asymptoteFinder(int m, int n) {
        // Determines the asymptote types
        if (m == n) {
            System.out.println("The asymptote is horizontal.");

        } else if (m < n) {
            System.out.println("The asymptote is the x-axis.");

        } else if (m > n) {
            String[] names = { "Linear", "Quadratic", "Cubic", "Quartic", "Quintic", "Sextic", "Septic", "Octic",
                    "Nonic", "Decic" };

            // Gives name based on degree difference (can also use a list of strings
            System.out.println("The asymptote is " + ((m - n > 0 && m - n <= 10) ? names[m - n] : "N/A"));
        }
    }

    public static void main(String[] arg) {
        // Declarations
        Scanner keyboard = new Scanner(System.in);
        char response = 'y';

        while (response == 'y') {
            // Prompts user with a menu
            System.out.println("-----------------------------------");
            System.out.println("Please select an option below:");
            System.out.println("[1] Quadratic Formula");
            System.out.println("[2] Pi Approximation");
            System.out.println("[3] Asymptote Finder");
            System.out.print("Your selection: ");
            int selection = Integer.parseInt(keyboard.nextLine());
            System.out.println("-----------------------------------");

            // Selection
            switch (selection) {
                case 1: // Quadratic Formula
                    // Prompts user for inputs
                    System.out.print("\nPlease enter your a value: ");
                    double a = keyboard.nextDouble();
                    keyboard.nextLine(); // Consume newline

                    System.out.print("Please enter your b value: ");
                    double b = keyboard.nextDouble();
                    keyboard.nextLine(); // Consume newline

                    System.out.print("Please enter your c value: ");
                    double c = keyboard.nextDouble();
                    keyboard.nextLine(); // Consume newline

                    quadraticFormula(a, b, c);
                        break;
                    case 2: // Pi Approximation
                        // Prompts user for an n value
                        System.out.print("Please enter an n value: ");
                        int n = keyboard.nextInt();
                        keyboard.nextLine(); // Consume newline
                        System.out.println("The approximate value of pi is: " + piApproximation(n));
                        break;
                    case 3: // Asymptote Finder
                        // Prompts user for m and n values
                        System.out.print("Please enter the degree of the rational polynomial's numerator (m): ");
                        int m = keyboard.nextInt();
                        keyboard.nextLine(); // Consume newline
    
                        System.out.print("Please enter the degree of the rational polynomial's denominator (n): ");
                        n = keyboard.nextInt();
                        keyboard.nextLine(); // Consume newline
    
                        asymptoteFinder(m, n);
                        break;
                default: // retries if invalid
                    System.out.println("Invalid input. Please try again.");
                    continue;
            }

            // Asks to try again
            System.out.print("Do you wish to make another selection? (y/n):");
            response = keyboard.next().toLowerCase().charAt(0);
            keyboard.nextLine(); // Consume newline
        }

        keyboard.close();
    }
}
