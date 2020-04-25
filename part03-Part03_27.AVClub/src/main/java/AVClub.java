
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            String string = scanner.nextLine();
        
            // If string is blank, end program
            if (string.equals("")) {
                break;
            }
            // Split words in string
            String[] pieces = string.split(" ");

            // Print pieces elements on separate lines
            for (String piece : pieces) {
                // Print words that contain av
                if (piece.contains("av") == true) {
                    System.out.println(piece);
                }
            }

        }
    }
}
