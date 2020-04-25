
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for number and assign
        System.out.println("How many times?");
        int num = Integer.valueOf(scanner.nextLine());
        
        int i = 0;
        
        // Call printText num times
        while (i < num) {
            printText();
            i++;
        }
    }
    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        // Print message
        System.out.println("In a hole in the ground there lived a method");
    }
}
