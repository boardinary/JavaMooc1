
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private JokeManager manager;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void start() {

        while (true) {
            System.out.println("Commands:\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop");
            String command = this.scanner.nextLine();

            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                this.manager.addJoke(scanner.nextLine());
                continue;
            } else if (command.equals("2")) {
                System.out.println(this.manager.drawJoke());
                continue;
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.manager.printJokes();
                continue;
            } else if (command.equals("X")) {
                break;
            }
        }
    }
}
