
import java.util.Scanner;
import java.lang.Math;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String number = scanner.nextLine();
                       
            if (number.equals("end")) {
                break;
            }
            
            double cube = Math.pow(Double.valueOf(number), 3);
            
            System.out.println(((int) cube));
        }
    }
}
