// Cosine Law Homework (2/12/25)
import java.util.Scanner;

public class CosineLaw {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Creates scanner object

        // Prompts user for 2 sides and an angle
        System.out.print("Please enter the value of Side A: ");
        double sideA = keyboard.nextDouble();

        System.out.print("Please enter the value of Side B: ");
        double sideB = keyboard.nextDouble();

        System.out.print("Please enter the value of Angle C (in degrees): ");
        double angleC = keyboard.nextDouble();

        keyboard.close();

        // Calculates side value (Cosine law)
        double SideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB * Math.cos(Math.toRadians(angleC)));

        // Outputs result
        System.out.println("The value of Side C is " + SideC);
    }
}
