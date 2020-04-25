
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assign user input to variable
        int num = Integer.valueOf(scanner.nextLine());
        
        
        // print numbers 0 thru num
        for (int i = num; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
