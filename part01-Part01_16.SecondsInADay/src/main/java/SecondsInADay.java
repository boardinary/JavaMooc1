
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for days
        System.out.println("How many days would you like to convert to seconds?");
        
        // Assign user input to integer
        int days = Integer.valueOf(scanner.nextLine());
        
        // Number of seconds in a day
        int daystosec = 86400;
        
        // Convert days to seconds
        int seconds = days * daystosec;
        
        // Print output
        System.out.println(seconds);
    }
}
