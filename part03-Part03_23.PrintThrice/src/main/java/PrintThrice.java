
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for string
        System.out.print("Give a word: ");
        String string = scanner.nextLine();

        // Print string three times
        System.out.print(string);
        System.out.print(string);
        System.out.print(string);

    }
}
