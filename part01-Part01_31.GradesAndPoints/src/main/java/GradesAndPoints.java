
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Prompt user for first number
        System.out.println("Give the first number:");
        
        // Assign first number to variable
        int num1 = Integer.valueOf(scan.nextLine());
        
        // Conditionals for grades
        if (num1 < 0) {
            System.out.println("Grade: impossible!");
        } else if (num1 < 50) {
            System.out.println("Grade: failed");
        } else if (num1 < 60) {
            System.out.println("Grade: 1");
        } else if (num1 < 70) {
            System.out.println("Grade: 2");
        } else if (num1 < 80) {
            System.out.println("Grade: 3");
        } else if (num1 < 90) {
            System.out.println("Grade: 4");
        } else if (num1 <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
    }
}
