
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

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
            
            // Count numbers
            count++;
        }

        // Print count
        System.out.println("Number of numbers: " + count);
        
        // Print sum
        System.out.println("Sum of the numbers: " + sum);
    }
}
