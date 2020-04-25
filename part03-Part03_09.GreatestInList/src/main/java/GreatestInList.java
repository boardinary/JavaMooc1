
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        int greatest = list.get(0);
        // Iterate through list to find greatest number
        for(int i = 0; i < list.size(); i++) {
            // Condition to check if greatest
            if (greatest < list.get(i)) {
                greatest = list.get(i);
            }
        }
        
        // Print greatest number in list
        System.out.println("The greatest number: " + greatest);
    }
}
