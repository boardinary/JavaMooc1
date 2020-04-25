
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for string
        System.out.println("Give a string:");
        
        // Assign user input to string
        String input1 = scan.nextLine();
        
        // Prompt user for integer
        System.out.println("Give an integer:");
        
        //Assign user input to int
        int input2 = Integer.valueOf(scan.nextLine());
        
        // Prompt user for double
        System.out.println("Give a double:");
        
        // Assign user input to double
        double input3 = Double.valueOf(scan.nextLine());
        
        // Prompt user for boolean
        System.out.println("Give a boolean:");
        
        // Assign user input to boolean
        boolean input4 = Boolean.valueOf(scan.nextLine());
        
        // Print inputs
        System.out.println("You gave the string " + input1);
        System.out.println("You gave the integer " + input2);
        System.out.println("You gave the double " + input3);
        System.out.println("You gave the boolean " + input4);
        
    }
}
