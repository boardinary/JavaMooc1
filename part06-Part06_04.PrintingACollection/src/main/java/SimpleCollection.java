
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        int count = this.elements.size();
        
        if (count == 0) {
            return "The collection " + this.name + " is empty.";
        }
        
        if (count == 1) {
            return "The collection " + this.name + " has " + count + 
                    " element:\n" + this.elements.get(0);
        }
        
        String list = "The collection " + this.name + " has " + count +
                " elements:\n";
        
        for (String element:elements) {
            list = list + element + "\n";
        }
        
        return list;
    }
    
}
