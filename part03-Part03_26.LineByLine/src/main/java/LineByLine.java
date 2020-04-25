
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.nextLine();

            if (string.equals("")) {
                break;
            }
            // Split words in string
            String[] pieces = string.split(" ");

            // Print pieces elements on separate lines
            for (String piece : pieces) {
                System.out.println(piece);
            }

        }

    }
}
