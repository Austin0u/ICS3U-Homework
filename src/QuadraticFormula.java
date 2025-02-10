// Mathematical Ooperations Homework (2/10/25)
import java.util.Scanner;

public class QuadraticFormula {
    private static void print(String text) {
        // Print shortcut
        System.out.print(text);
    }
    
    public static double[] calculateRoots(double a, double b, double c) {
        // Calculate each root and return as array
        return new double[] { 
            (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a), // Value for root 1
            (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a)  // Value for root 2
        };
    }

    public static void main(String[] arg) {
        // Declarations
        Scanner scanner = new Scanner(System.in);

        // Prompts user for inputs
        print("\nEnter your a value: ");
        double a = scanner.nextDouble();

        print("Enter your b value: ");
        double b = scanner.nextDouble();

        print("Enter your c value: ");
        double c = scanner.nextDouble();

        double[] roots = calculateRoots(a, b, c); // calculates and returns roots as an array
        double discriminant = Math.pow(b, 2) - (4 * a * c); // Calculates the discriminant

        // Prints the results
        print("\nGiven the eqaution: " + a + "x^2 + " + b + "x + " + c + " = 0,");

        if (discriminant == 0) { // One real root
            print("\nYour only root is: " +  (-b / (2 * a))); // Value for singular root
        } else if (discriminant > 0) {
            print("\nYour first root is: " + roots[0]);
            print("\nYour second root is: " + roots[1]);
        } else {
            print("\nThere are no real roots.");
        }
        
        scanner.close();
    }
}

/* SIMPLE VERSION
import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String[] arg) {
        // Declarations
        Scanner scanner = new Scanner(System.in);

        // Prompts user for inputs
        print("\nEnter your a value: ");
        double a = scanner.nextDouble();

        print("Enter your b value: ");
        double b = scanner.nextDouble();

        print("Enter your c value: ");
        double c = scanner.nextDouble();

        print("\nYour first root is: " + (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a)); // Value for root 1
        print("\nYour second root is: " + (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a)); // Value for root 2
        
        
        scanner.close();
    }
}
 */