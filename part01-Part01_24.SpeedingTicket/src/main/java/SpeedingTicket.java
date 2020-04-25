
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for integer
        System.out.println("Give speed:");

        // Assign user input to variable
        int speed = Integer.valueOf(scanner.nextLine());

        // Condition for speeding ticket
        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
