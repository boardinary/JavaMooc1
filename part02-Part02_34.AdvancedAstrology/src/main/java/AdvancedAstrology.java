
public class AdvancedAstrology {

    public static void printStars(int number) {
        // Loop number times
        int i = 0;
        while (i < number) {
            
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // Print spaces
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // Iterate columns of triangle and call print methods
        for (int i = 1; i <= size; i++) {
            // Print spaces
            printSpaces(size - i);
            // Print stars
            printStars(i);

        }
    }

    public static void christmasTree(int height) {
        // Iterate columns of tree branch section
        for (int i = 1, j = 1; i <= height; i++, j += 2) {
            // Print spaces
            printSpaces(height - i);
            // Print stars
            printStars(j);

        }
        
        // Print trunk section
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);

    }

    

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
