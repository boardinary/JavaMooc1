
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        for (String m:meals) {
            if (m.equals(meal)) {
                return;
            }            
        }
        
        this.meals.add(meal);        
    }
    
    public void printMeals() {
        for (String meal:meals) {
            System.out.println(meal);
        }
    }
    
    public void clearMenu() {
        this.meals.clear();
    }
}
