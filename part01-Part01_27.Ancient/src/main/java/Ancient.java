
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for year
        System.out.println("Give a year:");
        
        // Assign user input to integer
        int year = Integer.valueOf(scan.nextLine());
        
        if (year < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
