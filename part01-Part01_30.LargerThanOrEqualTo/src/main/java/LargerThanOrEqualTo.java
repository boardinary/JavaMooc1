
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Prompt user for first number
        System.out.println("Give the first number:");
        
        // Assign first number to variable
        int num1 = Integer.valueOf(scan.nextLine());
        
        // Prompt user for second number
        System.out.println("Give the second number:");
        
        // Assign second number to variable
        int num2 = Integer.valueOf(scan.nextLine());
        
        if (num1 > num2) {
            System.out.println("Greater number is: " + num1);
        } else if (num1 < num2){
            System.out.println("Greater number is: " + num2);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
