import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birdList = new ArrayList<>();
        ArrayList<String> observations = new ArrayList<>();
        
        // User interface and command functions
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                
                boolean containsBird = false;
                for (Bird bird : birdList) {
                    if (bird.getName().equals(birdName)) {
                        bird.addObservation();
                        containsBird = true;
                    }
                }
                // If not a valid bird
                if (!containsBird) {
                    System.out.println("Not a bird!");
                }
                continue;
            }
            // Add bird object to bird list
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                Bird bird = new Bird(name, latinName);
                birdList.add(bird);
                
                continue;
            }
            
            if (command.equals("All")) {
                for (Bird bird : birdList) {
                    System.out.println(bird);
                }
                continue;
            }
            
            if (command.equals("One")) {
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                
                boolean containsBird = false;
                for (Bird bird : birdList) {
                    if (bird.getName().equals(birdName)) {
                        System.out.println(bird);
                        containsBird = true;
                    }
                }
                if (!containsBird) {
                    System.out.println("Not a bird!");
                }
                continue;
            }
        }
    }

}
