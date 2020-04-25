
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        int sum = 0;
        // Iterate through list and sum values
        for (int number: list) {
            sum = sum + number;
        }
        
        // Print sum
        System.out.println("Sum: " + sum);
    }
}
