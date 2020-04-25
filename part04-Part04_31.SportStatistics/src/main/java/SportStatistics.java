
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for file
        System.out.println("File:");
        String file = scan.nextLine();
        
        // Prompt user for team
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            
            // Loop through file and record lines to an array
            while (fileScanner.hasNextLine()) {
                // Define and split csv line
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                
                // Check for userinput team and output games 
                if (parts[0].equals(team)) {
                    games++;
                    if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (parts[1].equals(team)) {
                    games++;
                    if (Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])) {
                        wins++;
                    } else {
                        losses++;
                    }                    
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage());
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
