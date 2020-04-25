import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Create arraylist of books
        ArrayList<Books> library = new ArrayList<>();
        
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            
            // Break if empty input
            if (title.isEmpty()) {
                break;
            }
            
            // Collect remaining user data
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            // Create object
            library.add(new Books(title, pages, year));
        }
        
        System.out.print("What information will be printed? ");
        String report = scanner.nextLine();
        
        for (Books book: library) {
            if (report.equals("everything")) {
                System.out.println(book);
            } else {
                System.out.println(book.getTitle());
            }
        }
    }
}
