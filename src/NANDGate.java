// NAND Opperations Homework (2/18/25)
import java.util.Scanner;

public class NANDGate {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //Creates scanner object
        
        // Prompts user for 2 boolean values
        System.out.print("Please enter your a value: ");
        boolean a = keyboard.nextBoolean();

        System.out.print("Please enter your b value: ");
        boolean b = keyboard.nextBoolean();

        keyboard.close();

        // Outputs NAND result
        System.out.println("Your c value is " + !(a && b));
    }
}