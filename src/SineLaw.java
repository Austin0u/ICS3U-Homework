import java.util.Scanner;

public class SineLaw {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //Creates scanner object
        
        // Prompts user for 2 sides and an angle
        System.out.print("Please enter the value of Side A: ");
        double sideA = keyboard.nextDouble();

        System.out.print("Please enter the value of Side B: ");
        double sideB = keyboard.nextDouble();

        System.out.print("Please enter the value of Angle A (in degrees): ");
        double angleA = keyboard.nextDouble();

        keyboard.close();

        // Calculates angle 
        double angleB = Math.toDegrees(Math.asin(sideB*Math.sin(Math.toRadians(angleA))/sideA));

        // Outputs result
        System.out.println("The value of angle B in degrees is " + angleB + "°");
    }
}