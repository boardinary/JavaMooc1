
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        
        // Define a new object
        String message = scanner.nextLine();
        
        // Print message from user
        System.out.println(message);

    }
}
