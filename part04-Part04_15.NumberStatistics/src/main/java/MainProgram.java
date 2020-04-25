
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        Statistics stats = new Statistics();
        Statistics statsEven = new Statistics();
        Statistics statsOdd = new Statistics();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                break;
            }
            // add num to stats object
            stats.addNumber(num);

            // add num to odd or even objects
            if (num % 2 == 0) {
                statsEven.addNumber(num);
            } else {
                statsOdd.addNumber(num);
            }
        }

        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + statsEven.sum());
        System.out.println("Sum of odd numbers: " + statsOdd.sum());
    }
}
