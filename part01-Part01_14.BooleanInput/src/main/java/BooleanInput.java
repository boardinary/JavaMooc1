
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for something
        System.out.println("Write something:");
        
        // Get user input
        boolean input = Boolean.valueOf(scanner.nextLine());
        
        // Output boolean
        System.out.println("True or false? " + input);
        
    }
}
