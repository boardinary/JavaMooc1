
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for number
        System.out.println("Give a number:");
        
        // Get number and assign to float
        double value = Double.valueOf(scanner.nextLine());
        
        // Print value
        System.out.println("You gave the number " + value);

    }
}
