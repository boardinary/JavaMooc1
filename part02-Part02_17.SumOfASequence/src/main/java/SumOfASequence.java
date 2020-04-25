
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for number and assign
        System.out.println("Last number? ");
        int num = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
                
        for (int i = 1; i <= num; i++) {
            sum = i + sum;
        }
        
        System.out.println("The sum is " + sum);
    }
}
