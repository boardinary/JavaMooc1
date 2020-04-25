
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt user for input
            System.out.println("Carry on?");

            // Get user input and assign to string
            String input = scanner.nextLine();
            
            // Check for no
            if (input.equals("no")){
                break;
            }
        }

    }
}
