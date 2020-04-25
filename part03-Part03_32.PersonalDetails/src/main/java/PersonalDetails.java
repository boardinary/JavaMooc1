
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longest = 0;
        String longestName = new String();
        int count = 0;
        int totalAge = 0;
        
        while (true) {
            String string = scanner.nextLine();

            if (string.equals("")) {
                break;
            }
            // Split words in string
            String[] pieces = string.split(",");

            // Check if name is longest
            if (longest < pieces[0].length()) {
                longest = pieces[0].length();
                longestName = pieces[0];
            }
            
            // Sum and count ages
            count++;
            totalAge = totalAge + Integer.valueOf(pieces[1]);
        }
        
        // Calculate average age
        double avgAge = (double) totalAge / count;
        
        // Print longest name and average age
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avgAge);
    }
}
