import java.util.Scanner;

public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.dictionary = simpleDictionary;                       
    }
    
    public void start() {
        
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
                
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                
                this.dictionary.add(word, translation);
                
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();
                
                if (dictionary.translate(word) != null) {
                    System.out.println("Translation:  " + 
                            dictionary.translate(word));
                } else {
                    System.out.println("Word " + word + " was not found" );
                }
                
            } else {
                System.out.println("Unknown command");
            }           
        }
    }
}
