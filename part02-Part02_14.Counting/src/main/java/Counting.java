
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assign user input to variable
        int num = Integer.valueOf(scanner.nextLine());
        
        // print numbers 0 thru num
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
}
