
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Collect user first name
            System.out.print("First name: ");
            String first = scanner.nextLine();

            // Exit on blank entry
            if (first.isEmpty()) {
                break;
            }
            // Collect remaining user data
            System.out.print("Last name: ");
            String last = scanner.nextLine();
            System.out.print("Identification number: ");
            String id = scanner.nextLine();

            // Add new PersonalInformation object to list
            infoCollection.add(new PersonalInformation(first, last, id));

        }
        // Return names
        System.out.println("");
        for (PersonalInformation info : infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }
}
