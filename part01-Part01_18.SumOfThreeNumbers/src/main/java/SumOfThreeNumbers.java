
import java.util.Scanner;

public class SumOfThreeNumbers {

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
        
        // Prompt user for third number
        System.out.println("Give the third number:");
        
        // Assign third number to variable
        int num3 = Integer.valueOf(scanner.nextLine());
        
        // Add to get sum
        int sum = num1 + num2 + num3;
        
        // Print sum
        System.out.println("The sum of the numbers is " + sum);  

    }
}
