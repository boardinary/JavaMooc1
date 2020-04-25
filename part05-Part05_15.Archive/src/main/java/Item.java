
public class Item {
    private String identifier;
    private String name;
    
    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public boolean equals(Object item) {
        if (this == item) {
            return true;
        }
        
        if (!(item instanceof Item)) {
            return false;
        }
        
        Item compareditem =  (Item) item;
        if (this.identifier.equals(compareditem.identifier)) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
