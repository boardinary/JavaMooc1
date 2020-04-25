import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    
    public Suitcase(int maxWeight) {
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Item item:items) {
            totalWeight = totalWeight + item.getWeight();
        }
        
        return totalWeight;
    }
    
    public void printItems() {
        String print = "";
        
        for (Item item:items) {
            System.out.println(item.getName() + " (" + item.getWeight() +
                    " kg)");
        }

    }
    
    public Item heaviestItem() {
             
        if (items.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = new Item("h", 0);
        
        for (Item item:items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            } 
        }
        
        return heaviestItem;
    }
    
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        }
        
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
