
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Assign user input to integer
        int num1 = Integer.valueOf(scanner.nextLine());
                
        // Assign user input to integer
        int num2 = Integer.valueOf(scanner.nextLine());
        
        // Calc
        double result = Math.sqrt(((double) num1 + num2));
        
        // Print result
        System.out.println(result);

    }
}
