import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;
    
    public Recipe(ArrayList<String> list) {
        this.name = list.get(0);
        this.cookTime = Integer.valueOf(list.get(1));
        list.remove(0);
        list.remove(0);
        this.ingredients = new ArrayList<>(list);
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCookTime() {
        return this.cookTime;
    }
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookTime;
    }
    
    public boolean hasIngredient(String ingredient) {
        if (this.ingredients.contains(ingredient)) {
            return true;
        }
        return false;
    }
}
