
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for first string
        System.out.println("Enter the first string:");
        
        // Assign user input to string
        String first = scan.nextLine();
        
        // Prompt user for second string
        System.out.println("Enter the second string:");
        
        // Assign user input to string
        String second = scan.nextLine();
        
        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
