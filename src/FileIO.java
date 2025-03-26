
// File IO Homework (3/25/25)
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        // Variables to calculate avg
        double sum = 0;
        int count = 0;

        // Reading
        BufferedReader inputStream = null;
        String line = null;

        try {
            inputStream = new BufferedReader(new FileReader("numbers.txt"));
            while ((line = inputStream.readLine()) != null) {
                sum += Double.parseDouble(line);
                count++;
            }
        } catch (IOException exception) {
            System.out.println("Error opening file");
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("Error closing input file");
                }
            }

        }
        
        // Write
        FileWriter outputStream = null;

        try {
            outputStream = new FileWriter("average.txt");
            outputStream.write("The average is " + sum / count);
        } catch (IOException exception) {
            System.out.println("Error opening or writing to file");
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    System.out.println("Error closing file");
                }
    
            }
        }

    }
}
