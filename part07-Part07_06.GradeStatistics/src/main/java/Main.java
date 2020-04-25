
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeBook grades = new GradeBook();

        System.out.println("Enter point totals, -1 stops:");

        // Add scores to gradebook
        while (true) {
            int score = Integer.valueOf(scanner.nextLine());
            if (score == -1) {
                break;
            }

            grades.add(score);
        }

        // Print average statistics
        System.out.println("Point average (all): " + grades.averageScore());

        if (grades.averageOfPassingScores() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): "
                    + grades.averageOfPassingScores());
        }

        System.out.println("Pass percentage: " + grades.passPercentage());

        // Print distribution of grades
        System.out.println("5: " + grades.printDist(grades.numberOfGrades(5)));
        System.out.println("4: " + grades.printDist(grades.numberOfGrades(4)));
        System.out.println("3: " + grades.printDist(grades.numberOfGrades(3)));
        System.out.println("2: " + grades.printDist(grades.numberOfGrades(2)));
        System.out.println("1: " + grades.printDist(grades.numberOfGrades(1)));
        System.out.println("0: " + grades.printDist(grades.numberOfGrades(0)));
    }
}
