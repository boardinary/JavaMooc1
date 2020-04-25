
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {

        // Create scanner to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String file = scanner.nextLine();
        
        // Create scanner to read file
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            // Loop through all line in file
            while (fileScanner.hasNextLine()) {
                // Read next line
                String row = fileScanner.nextLine();
                // Print line
                System.out.println(row);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
