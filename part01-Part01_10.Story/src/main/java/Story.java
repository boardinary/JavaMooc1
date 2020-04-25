
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input1
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        
        // Get input1 from user
        String input1 = scanner.nextLine();
        
        // Prompt user for input2
        System.out.println("What is their job?");
        
        // Get input2 from user
        String input2 = scanner.nextLine();
        
        // Start story
        System.out.println("Here is the story:");
        
        // Print first line
        System.out.println("Once upon a time there was " + input1 + ", who was " + input2 + ".");
        
        // Print second line
        System.out.println("On the way to work, " + input1 + " reflected on life.");
        
        //Print third line
        System.out.println("Perhaps " + input1 + " will not be " + input2 + " forever.");
               

    }
}
