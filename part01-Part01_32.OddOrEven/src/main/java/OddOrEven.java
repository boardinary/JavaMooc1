
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for first number
        System.out.println("Give the first number:");
        
        // Assign first number to variable
        int num1 = Integer.valueOf(scan.nextLine());
        
        // Calculate modulus
        int remainder = num1 % 2;
        
        // Conditional for even or odd
        if (remainder != 0) {
            System.out.println("Number " + num1 + " is odd.");
        } else {
            System.out.println("Number " + num1 + " is even");
        }
    }
}
