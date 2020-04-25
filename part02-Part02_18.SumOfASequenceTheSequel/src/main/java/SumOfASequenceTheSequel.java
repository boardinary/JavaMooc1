
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first number and assign
        System.out.println("First number? ");
        int num1 = Integer.valueOf(scanner.nextLine());

        // Prompt user for last number and assign
        System.out.println("Last number? ");
        int num2 = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int i = num1; i <= num2; i++) {
            sum = i + sum;
        }

        System.out.println("The sum is " + sum);
    }
}
