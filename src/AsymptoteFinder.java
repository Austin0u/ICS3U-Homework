// Asymptote Finder Homework (2/21/25)
import java.util.Scanner;

public class AsymptoteFinder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Creates scanner object

        // Prompts user for the exponent/degree values: m & n
        System.out.print("Please enter the degree of the rational polynomial's numerator (m): ");
        int m = keyboard.nextInt();

        System.out.print("Please enter the degree of the rational polynomial's denominator (n): ");
        int n = keyboard.nextInt();

        keyboard.close();

        // Determines the asymptote types
        if (m == n) {
            System.out.println("The asymptote is horizontal.");

        } else if (m < n) {
            System.out.println("The asymptote is the x-axis.");

        } else if (m > n) {
            String name;

            // Gives name based on degree difference (can also use a list of strings)
            switch (m - n) {
                case 1:
                    name = "Linear";
                    break;
                case 2:
                    name = "Quadratic";
                    break;
                case 3:
                    name = "Cubic";
                    break;
                case 4:
                    name = "Quartic";
                    break;
                case 5:
                    name = "Quintic";
                    break;
                case 6:
                    name = "Sextic";
                    break;
                case 7:
                    name = "Septic";
                    break;
                case 8:
                    name = "Octic";
                    break;
                case 9:
                    name = "Nonic";
                    break;
                case 10:
                    name = "Decic";
                    break;
                default:
                    name = "N/A";
                    break;
            }

            System.out.println("The asymptote is " + name);
        }
    }
}
