
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> raw = new ArrayList<>();
        System.out.print("File to read: ");
        String file = scanner.nextLine();

        // Read file to list
        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                raw.add(fileScanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        // Add blank to end of list
        raw.add("");
        
        // Break list into recipe lists
        // Use recipe list as parameter for new recipe and add to recipe register
        RecipeRegister register = new RecipeRegister();
        ArrayList<String> recipeList = new ArrayList<>();
        for (String row : raw) {
            if (row.isEmpty()) {
                Recipe recipe = new Recipe(recipeList);
                register.add(recipe);
                recipeList.clear();
            } else {
                recipeList.add(row);
            }
        }

        while (true) {
            // Prompt user for command
            System.out.print("\nCommands:\n"
                    + "list - lists the recipes\n"
                    + "stop - stops the program\n"
                    + "find name - searches recipes by name\n"
                    + "find cooking time - searches recipes by cooking time\n"
                    + "find ingredient - searches recipes by ingredient\n"
                    + "\n"
                    + "Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;

            } else if (command.equals("list")) {
                System.out.println("\nRecipes:");
                register.printRecipeList();

            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
                register.printSearchedName(name);

            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes");
                register.printSearchedCookingTime(time);

            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("\nRecipes");
                register.printSearchedIngredients(ingredient);
            }
        }
    }

}
