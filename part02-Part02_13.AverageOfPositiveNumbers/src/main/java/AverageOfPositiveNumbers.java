
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            
            // Count positive numbers printed and sum them
            if (num > 0) {
                count++;
                sum = sum + num;
            }
        }
        
        // If no positive numbers input by user
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {                   
            // Calculate the average of positive numbers
            double avg = (double) sum / count;
            
            // Print avg
            System.out.println(avg);
        }
    }
}
