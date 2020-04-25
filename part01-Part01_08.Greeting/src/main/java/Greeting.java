
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for name
        System.out.println("What's your name?");
        
        // Store users name in variable
        String message = scanner.nextLine();
        
        // Print message containing user's name
        System.out.println("Hi " + message);

    }
}
