
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Assign user input to integer
        int num1 = Integer.valueOf(scanner.nextLine());
        
        // Calculate absolute value and print result
        if (num1 < 0) {
            num1 = num1 * -1;
            System.out.println(num1);
        } else {
            System.out.println(num1);
        }
    }
}
