import java.util.Scanner;

public class QuadraticFormula {
    

    private static void print(String text) {
        System.out.print(text);

    }

    public static double[] quadraticFormula(double a, double b, double c) {
        double x1 = (-b + Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
        double x2 = (-b - Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);

        return new double[]{x1, x2};
    }

    public static void main (String[] arg) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for inputs
        print("\nEnter your a value: ");
        double a = scanner.nextDouble();
        
        print("Enter your b value: ");
        double b = scanner.nextDouble();

        print("Enter your c value: ");
        double c = scanner.nextDouble();

        double[] roots = quadraticFormula(a, b, c); // calculates

        print("\nGiven the eqaution: " + a + "x^2 + " + b + "x + " + c + " = 0,");
        print("\nYour first root is: " + roots[0]);
        print("\nYour second root is: " + roots[1]);

        scanner.close();
    }

}
