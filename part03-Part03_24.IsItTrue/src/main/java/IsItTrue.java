
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for string
        System.out.println("Give a string: ");
        String string = scanner.nextLine();

        // Check if true
        if (string.equals("true") == true) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
