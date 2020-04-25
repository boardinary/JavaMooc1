
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for password
        System.out.println("Password?");
        
        // Assign user input to string
        String pwd = scan.nextLine();
        
        // Check if user input matches password
        if (pwd.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
