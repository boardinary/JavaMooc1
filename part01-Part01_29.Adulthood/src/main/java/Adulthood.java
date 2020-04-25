
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for number
        System.out.println("Give a number:");
        
        // Assign user input to variable
        int num = Integer.valueOf(scan.nextLine());
        
        if (num > 17) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}
