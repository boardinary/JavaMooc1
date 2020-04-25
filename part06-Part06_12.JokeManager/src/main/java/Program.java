
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        JokeManager manager = new JokeManager();
        manager.addJoke("What is red and smells of blue paint? - Red paint.");
        manager.addJoke("What is blue and smells of red paint? - Blue paint.");
        
        Scanner scanner = new Scanner(System.in);
        UserInterface UI = new UserInterface(manager, scanner);
        
        UI.start();
    }
}
