
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for message
        System.out.println("Write a message:");
        
        //Store message inside a variable
        String message = scanner.nextLine();
        
        // Print message 3 times
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
                

    }
}
