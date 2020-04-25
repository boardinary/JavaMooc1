
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 100;
        int container2 = 100;

        int container1Fill = 0;
        int container2Fill = 0;

        while (true) {
            System.out.print("First: " + container1Fill + "/"
                    + container1 + "\n" + "Second: " + container2Fill
                    + "/" + container2 + "\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            // Process user input into functional data
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            // Add function
            if (command.equals("add")) {
                if (amount < 0) {
                    continue;
                }
                if (container1Fill > container1 - amount) {
                    container1Fill = container1;
                } else {
                    container1Fill += amount;
                }
                continue;
            }

            // Move function
            if (command.equals("move")) {
                if (amount > container1Fill) {
                    amount = container1Fill;
                    container1Fill = 0;
                    container2Fill += amount;
                } else {
                    container1Fill -= amount;
                    if (container2Fill + amount > container2) {
                        container2Fill = container2;

                    } else {
                        container2Fill += amount;
                    }
                }
                continue;
            }

            // Remove function
            if (command.equals("remove")) {
                if (amount > container2Fill) {
                    container2Fill = 0;
                } else {
                    container2Fill -= amount;
                }
                continue;
            }
        }
    }

}
