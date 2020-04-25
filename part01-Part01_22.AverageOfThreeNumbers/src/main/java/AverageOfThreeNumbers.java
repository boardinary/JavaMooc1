
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first number
        System.out.println("Give the first number:");
        
        // Assign first number to variable
        int num1 = Integer.valueOf(scanner.nextLine());
        
        // Prompt user for second number
        System.out.println("Give the second number:");
        
        // Assign second number to variable
        int num2 = Integer.valueOf(scanner.nextLine());
        
        //Prompt user for third number
        System.out.println("Give the third number:");
        
        int num3 = Integer.valueOf(scanner.nextLine());
        
        // Calculate average
        double avg = ((double) num1 + num2 + num3) / 3;
        
        // Print output
        System.out.println("The average is " + avg);

    }
}
