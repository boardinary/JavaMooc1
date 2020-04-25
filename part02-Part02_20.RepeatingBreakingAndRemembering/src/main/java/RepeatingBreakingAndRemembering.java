
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int odd = 0;
        int even = 0;

        // Prompt user for numbers
        System.out.println("Give numbers:");

        while (true) {

            // Assign user input to variable
            int num = Integer.valueOf(scanner.nextLine());

            // Check if number is -1
            if (num == -1) {
                break;
            }

            sum = sum + num;
            count++;

            // Sum even numbers
            if (num % 2 == 0) {
                even++;
            }
        }

        double avg = (double) sum / count;

        // Calc number of odd numbers
        odd = count - even;

        // Print outputs
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
