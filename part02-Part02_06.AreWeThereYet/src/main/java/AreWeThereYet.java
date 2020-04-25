
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
                    
            // Prompt user for number and assign to int
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            // End program when user enters 4
            if (num == 4) {
                break;
            }
        
        }
    }
}
