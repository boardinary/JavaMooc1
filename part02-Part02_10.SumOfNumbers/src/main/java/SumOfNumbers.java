
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        
        while (true) {
            // Prompt user for number and assign to variable
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            // Exit loop if num = 0
            if (num == 0) {
                break;
            }

            // Sum numbers            
            sum = sum + num;
        }

        // Print sum
        System.out.println("Sum of the numbers: " + sum);
    }
}
