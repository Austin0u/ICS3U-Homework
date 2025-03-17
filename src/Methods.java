
// Methods Homework (3/17/25)
import java.util.Scanner;

public class Methods {
    public static double[] quadraticFormula(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - (4 * a * c); // Calculates the discriminant
        // Calculate each root and return as array
        return new double[] {
                (-b + Math.sqrt(discriminant)) / (2 * a), // Value for root 1
                (-b - Math.sqrt(discriminant)) / (2 * a) // Value for root 2
        };
    }

    public static double piApproximation(int n) {
        double sum = 0; // Resets sum

        // Calculates the sum
        for (int i = 0; i < n; i++) {
            sum += Math.pow(-1, i) / (2 * i + 1);
        }

        return 4 * sum;
    }

    public static String asymptoteFinder(int m, int n) {
        // Determines the asymptote types
        if (m == n) {
            System.out.println("The asymptote is horizontal.");

        } else if (m < n) {
            System.out.println("The asymptote is the x-axis.");

        } else if (m > n) {
            String[] names = {"Linear","Quadratic","Cubic","Quartic","Quintic","Sextic","Septic","Octic","Nonic","Decic"};

            // Gives name based on degree difference (can also use a list of strings
            return (m - n > 0 && m - n <= 10) ? names[m-n] : "N/S";
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

                    System.out.print("Please enter your b value: ");
                    double b = keyboard.nextDouble();

                    System.out.print("Please enter your c value: ");
                    double c = keyboard.nextDouble();

                    // Calculations
                    double discriminant = Math.pow(b, 2) - (4 * a * c); // Calculates the discriminant
                    double[] roots = quadraticFormula(a, b, c); // Calculates and returns roots as an array

                    if (discriminant == 0) { // One real root
                        System.out.print("\nYour only root is: " + (-b / (2 * a))); // Value for singular root
                    } else if (discriminant > 0) { // Two real roots
                        System.out.print("\nYour first root is: " + roots[0]);
                        System.out.print("\nYour second root is: " + roots[1]);
                    } else {
                        System.out.print("\nThere are no real roots.");
                    }

                    break;
                case 2: // Pi Appoximation
                    // Prompts user for an n value
                    System.out.print("Please enter an n value: ");
                    System.out.println("The approximate value of pi is: " + piApproximation(keyboard.nextInt()));

                    break;
                case 3: // Asymptote Finder
                    // Prompts user for the exponent/degree values: m & n
                    System.out.print("Please enter the degree of the rational polynomial's numerator (m): ");
                    int m = keyboard.nextInt();

                    System.out.print("Please enter the degree of the rational polynomial's denominator (n): ");
                    int n = keyboard.nextInt();
                    
                    System.out.println("The asymptote is " + asymptoteFinder(m, n));

                    break;
                default: // retries if invalid
                    System.out.println("Invalid input. Please try again.");
                    break;
            }

            // Asks to try again
            System.out.println("Do you wish to make another selection? (y/n)");
            response = keyboard.next().toLowerCase().charAt(0);
        }

        keyboard.close();
    }
}
