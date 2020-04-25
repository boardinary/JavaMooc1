
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Item> itemList = new ArrayList<>();

        // Collect user data and add items to the itemList
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            
            String identifier = scanner.nextLine(); 
            // Break if user input is blank
            if (identifier.isEmpty()) {
                break;
            }        
                               
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            // Break if user input is blank
            if (name.isEmpty()) {
                break;
            }
                       
            Item item = new Item(identifier, name);            
            
            // Search list to see if item is duplicate
            if (!itemList.contains(item)) {
                itemList.add(item);
            }            
        }

        // Print itemList
        System.out.println("==Items==");
        for (Item i:itemList) {
            System.out.println(i);
        }
    }
}
