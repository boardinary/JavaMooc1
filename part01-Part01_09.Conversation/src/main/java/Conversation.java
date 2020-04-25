
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Greet user with message
        System.out.println("Greetings! How are you doing?");
        
        // Get user's first resonse
        String first = scanner.nextLine();
                      
        // Respond to user's first message
        System.out.println("Oh, how interesting. Tell me more!");
        
        // Get user's second resonse
        String second = scanner.nextLine();
        
        // Respond to user's second message
        System.out.println("Thanks for sharing!"); 
              
    }
}
