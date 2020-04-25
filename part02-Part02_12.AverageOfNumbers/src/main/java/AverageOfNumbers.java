
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            // Prompt user for number and assign to variable
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            // Exit loop if num = 0
            if (num == 0) {
                break;
            }
            // Sum numbers and count them
            count++;
            sum = sum + num;

        }

        // Calculate the average of positive numbers
        double avg = (double) sum / count;

        // Print avg
        System.out.println("Average of the numbers: " + avg);
    }
}
