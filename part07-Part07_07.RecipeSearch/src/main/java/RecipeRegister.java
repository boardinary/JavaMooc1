
import java.util.ArrayList;

public class RecipeRegister {

    private ArrayList<Recipe> list;

    public RecipeRegister() {
        this.list = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        this.list.add(recipe);
    }

    public void printRecipeList() {
        for (Recipe recipe : this.list) {
            System.out.println(recipe);
        }
    }

    public void printSearchedName(String term) {
        for (Recipe recipe : this.list) {
            if (recipe.getName().contains(term))
                System.out.println(recipe);
        }        
    }
    
    public void printSearchedCookingTime(int time) {
        for (Recipe recipe : this.list) {
            if (recipe.getCookTime() <= time)
                System.out.println(recipe);
        }
    }
    
    public void printSearchedIngredients(String ingredient) {
        for (Recipe recipe : this.list) {
            if (recipe.hasIngredient(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}
