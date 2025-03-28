
// File IO Homework (3/25/25)
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) throws Exception {
        BufferedReader inputStream = null;
        FileWriter outputStream = null;
        String line = "";
        double sum = 0.0;
        int count = 0;

        System.out.println("-----------------------------------"); // DEBUG

        try {
            System.out.println("Attempting to read numbers.txt"); // DEBUG

            inputStream = new BufferedReader(new FileReader("numbers.txt"));
            outputStream = new FileWriter("average.txt");

            while ((line = inputStream.readLine()) != null) {
                sum += Double.parseDouble(line);
                count++;
                System.out.println("> Line " + count + ": " + line); // DEBUG
            }

            System.out.println("-----------------------------------"); // DEBUG

            System.out.println("Attempting to write to average.txt"); // DEBUG
            outputStream.write("The average is " + sum / count);
            System.out.println("> The average is " + sum / count); // DEBUG

        } catch (FileNotFoundException e) {
            System.out.println("Error opening file");
        } catch (IOException e) {
            System.out.println("Error creating file");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }

            if (outputStream != null) {
                System.out.println("-----------------------------------"); // DEBUG
                System.out.println("Closing Program..."); // DEBUG
                outputStream.close();
            }
        }
    }
}