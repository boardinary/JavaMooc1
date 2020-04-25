
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for number
        System.out.println("Give a number:");
        
        // Assign user input to variable
        int num = Integer.valueOf(scan.nextLine());
        
        // Check for positivity
        if (num > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
