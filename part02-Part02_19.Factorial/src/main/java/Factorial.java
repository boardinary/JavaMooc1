
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first number and assign
        System.out.println("First number? ");
        int num = Integer.valueOf(scanner.nextLine());

        int factorial = 1;
        
        // Calculate factorial
        for (int i = num; i > 0; i--) {
                                   
            factorial = i * factorial;
        }
        
        // Print factorial
        System.out.println("Factorial: " + factorial);
    }
}
