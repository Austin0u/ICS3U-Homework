// Arrys Homework (3/4/25)
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] strings = new String[10];

        search:
        while (true) {
            // Prompts user with a menu
            System.out.println("-----------------------------------");
            System.out.println("Please select an option below:");
            System.out.println("[1] Input 10 strings into array");
            System.out.println("[2] Print array");
            System.out.println("[3] Access a string from array");
            System.out.println("[4] Exit Program");
            System.out.print("Your selection: ");
            int selection = Integer.parseInt(keyboard.nextLine());
            System.out.println("-----------------------------------");

            // Selection
            switch (selection) {
                case 1: // inputting strings
                    for (int i = 0; i < strings.length; i++) {
                        System.out.print("/nInput #" + (i+1) + ": ");
                        strings[i] = keyboard.nextLine();
                    }
                    break;
                case 2: // prints array
                    for (int i = 0; i < strings.length; i++) {
                        System.out.println("String #" + (i+1) + " = " + strings[i]);
                    }
                    break;
                case 3: // indexing
                    System.out.println("Which string do you want to replace? (1-10)");
                    System.out.print("Input (index): ");
                    int index = Math.abs(Integer.parseInt(keyboard.nextLine()))-1;
                    
                    if (index < 10) {
                        System.out.println("The string is " + strings[index]);
                    }

                    break;
                case 4: // exits program
                    break search;
                default: // retries if invalid
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
        keyboard.close();
    }
}