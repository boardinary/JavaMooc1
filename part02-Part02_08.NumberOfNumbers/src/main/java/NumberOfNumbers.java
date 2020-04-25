
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (true) {
            // Prompt user for number and assign to variable
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            // Exit loop if num = 0
            if (num == 0) {
                break;
            }
            count++;            
        }
        System.out.println("Number of numbers: " + count);
    }
}
