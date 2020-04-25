
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Promt user for number
        System.out.print("Where to? ");

        // Assign user input to variable
        int num1 = Integer.valueOf(scanner.nextLine());

        // Promt user for number
        System.out.print("Where from? ");

        // Assign user input to variable
        int num2 = Integer.valueOf(scanner.nextLine());

        // Only print if num2 < num1
        if (num2 < num1) {            
            // print numbers num2 thru num1
            for (int i = num2; i <= num1; i++) {
                System.out.println(i);
            }
        }
    }
}
