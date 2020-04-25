
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {

        // Create scanner to read file
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {
            // Loop through all line in file
            while (scanner.hasNextLine()) {
                // Read next line
                String row = scanner.nextLine();
                // Print line
                System.out.println(row);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
    }
}
