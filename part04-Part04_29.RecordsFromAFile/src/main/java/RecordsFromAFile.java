
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                // Split string
                String[] parts = line.split(",");
                
                // Print line in correct format with years in correct format
                if (Integer.valueOf(parts[1]) == 1) {
                    System.out.println(parts[0] + ", age: " + parts[1] + " year");
                } else {
                    System.out.println(parts[0] + ", age: " + parts[1] + " years");
                }                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
