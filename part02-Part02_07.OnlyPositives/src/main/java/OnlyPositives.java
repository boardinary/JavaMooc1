
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt user for number and assign to variable
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            // Condition to check and specify output 
            if (num == 0) {
                break;
            } else if (num < 0) {
                System.out.println("Unsuitable number");
            } else {
                System.out.println(num * num);
            }
        
        }
    }
}
