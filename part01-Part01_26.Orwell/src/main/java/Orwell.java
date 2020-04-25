
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for integer
        System.out.println("Give a number:");
        
        // Assign user input to variable
        int num = Integer.valueOf(scan.nextLine());
        
        // Check if number is 1984
        if ( num == 1984) {
            System.out.println("Orwell");
        }
    }
}
