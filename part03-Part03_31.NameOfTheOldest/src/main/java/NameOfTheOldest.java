
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String oldestName = new String();
        while (true) {
            String string = scanner.nextLine();

            if (string.equals("")) {
                break;
            }
            // Split words in string
            String[] pieces = string.split(",");

            // Check if age is the oldest
            if (oldest < Integer.valueOf(pieces[1])) {
                oldest = Integer.valueOf(pieces[1]);
                oldestName = pieces[0];
            }
        }

        System.out.print("Name of the oldest: " + oldestName);

    }
}
