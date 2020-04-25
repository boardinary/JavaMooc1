
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        
        // Record user input values to list
        while (true) {
            // Get user input
            int input = Integer.valueOf(scanner.nextLine());
            
            // Condition to check if break condition is true
            if (input == 9999) {
                break;
            }
            
            // Record user input to list
            list.add(input);
        }
        
        int smallest = list.get(0);
        // Iterate through list to find smallest number
        for (int i = 0; i < list.size(); i++) {
            if (smallest > list.get(i)) {
                smallest = list.get(i);
            }
        }
        
        // Print smallest number
        System.out.println("Smallest number: " + smallest);
        
        ArrayList<Integer> smallestIndexList = new ArrayList<>();
        // Iterate through list to find smallest number indices and add to
        // smallestIndexList
        for (int i = 0; i < list.size(); i++) {
            if (smallest == list.get(i)) {
                smallestIndexList.add(i);
                // Print index
                System.out.println("Found at index: " + i);
            }
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
