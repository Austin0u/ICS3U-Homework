// Arrays Homework #2 (3/5/25)
import java.util.Scanner;

public class PolynomialFunction {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String polynomial = "f(x) =";
        double sum = 0;

        // Prompts the user for the coefficients, exponents, and an x value
        System.out.print("Please enter your coefficients (separate with a space): ");
        String[] coefficients = keyboard.nextLine().split(" ");
        System.out.print("Please enter your exponents (separate with a space): ");
        String[] exponents = keyboard.nextLine().split(" ");
        System.out.print("Please enter your x value: ");
        double x = keyboard.nextDouble();


        keyboard.close();

        // Calculates sum
        for (int i = 0; i < coefficients.length; i++) {
            sum += Double.parseDouble(coefficients[i]) * Math.pow(x,Integer.parseInt(exponents[i]));
        }

        // Prints functions
        for (int i = 0; i < coefficients.length; i++) {
            boolean isNegative = (Double.parseDouble(coefficients[i]) < 0)  ? true : false;
            String term = coefficients[i] + "x^" + exponents[i];

            polynomial += " " + ((isNegative) ? "" : ((i!=0) ? "+" : "")) + term;
        }

        // Outputs result
        System.out.println("Your polynomial function is: " + polynomial);
        System.out.println("You polynomial at x = " + x + " is: f(" + x + ") = "+  sum);
    }
}
