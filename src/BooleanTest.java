import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Prompts the user for the 4 booleans
        System.out.print("Please input an A value (true/false): ");
        Boolean a = keyboard.nextBoolean();
        System.out.print("Please input an B value (true/false): ");
        Boolean b = keyboard.nextBoolean();
        System.out.print("Please input an C value (true/false): ");
        Boolean c = keyboard.nextBoolean();
        System.out.print("Please input an D value (true/false): ");
        Boolean d = keyboard.nextBoolean();
        keyboard.close();

        // Calculates and prints output result
        Boolean output = ((a && b)||(c && d))||((a && c)||(a && d))||((b && d)||(b && c));
        System.out.println("The output value is " + output);
    }
}
