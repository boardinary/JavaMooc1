
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assign user inputs to integers
        int beginning = Integer.valueOf(scanner.nextLine());
        int end = Integer.valueOf(scanner.nextLine());

        divisibleByThreeInRange(beginning, end);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        
        // Print numbers divisible by three between beginning and end
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
