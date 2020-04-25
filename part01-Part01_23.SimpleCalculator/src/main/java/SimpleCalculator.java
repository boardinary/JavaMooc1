
import java.util.Scanner;

public class SimpleCalculator {

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
        
        // Calculate outputs
        int sum = num1 + num2;
        int sub = num1 - num2;
        int prod = num1 * num2;
        double quo = (double) num1 / num2;
        
        // Print outputs
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + sub);
        System.out.println(num1 + " * " + num2 + " = " + prod);
        System.out.println(num1 + " / " + num2 + " = " + quo);

    }
}
