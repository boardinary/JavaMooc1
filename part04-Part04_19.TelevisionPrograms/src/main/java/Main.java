
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            // Break if blank
            if (name.isEmpty()) {
                break;
            }
            
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name, duration));            
        }
        
        // Prompt user for max duration and return programs that meet spec
        System.out.println("Program's maximum duration? ");
        int duration = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram program: programs) {
            if (program.getDuration() <= duration) {
                System.out.println(program);
            }
        }
    }
}
