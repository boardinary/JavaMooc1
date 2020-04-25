
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("stop")) {
                break;

            } else if (command.equals("add")) {
                System.out.print("To add: ");
                this.list.add(this.scanner.nextLine());

            } else if (command.equals("list")) {
                this.list.print();                
                
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                this.list.remove(Integer.valueOf(this.scanner.nextLine()));
            }
        }
    }
}
