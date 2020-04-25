
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Assign user input to integer
        int num = Integer.valueOf(scanner.nextLine());
        
        // Square user input
        num = num * num;
        
        // Print result
        System.out.println(num);
    }
}
