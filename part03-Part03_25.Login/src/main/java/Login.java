
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userArray = {"alex", "emma"};
        String[] passwordArray = {"sunshine", "haskell"};
        
        // Prompt user for username and password
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();   
        
        int index = 0;
        boolean found = false;
        // Search array for username
        for (int i = 0; i < userArray.length; i++) {
            if (user.equals(userArray[i]) == true) {
                index = i;
                found = true;
            }
        }
        // Print message if username not found
        if (found = false) {
            System.out.println("Incorrect username or password!");
        }
        
        // Compare password for match
        if (password.equals(passwordArray[index])) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
