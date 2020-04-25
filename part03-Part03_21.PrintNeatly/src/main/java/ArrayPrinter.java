
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Print formated array output for all elements except last
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        
        // Print last element
        System.out.println(array[array.length - 1]);
    }
}
