
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for int
        System.out.println("Give a number:");
        
        // Assign user input to int variable
        int value = Integer.valueOf(scanner.nextLine());
        
        // Print value to user
        System.out.println("You gave the number " + value);
        
    }
}
