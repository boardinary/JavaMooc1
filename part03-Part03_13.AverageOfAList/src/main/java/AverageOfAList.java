
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        // Add user inputs to list and stop at -1
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            }
            
            list.add(number);
        }
        
        int sum = 0;
        // Iterate through list and sum values
        for (int number: list) {
            sum = sum + number;
        }
        
        // Calculate average
        double avg = (double) sum / list.size();
        
        // Print average
        System.out.println("Sum: " + avg);
        
    }
}
