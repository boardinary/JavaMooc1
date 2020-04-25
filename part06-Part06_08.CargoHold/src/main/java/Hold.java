
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        // Sum total weight
        for (Suitcase s : suitcases) {
            totalWeight = totalWeight + s.totalWeight();
        }

        if (totalWeight + suitcase.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
        }

    }

    public String toString() {
        int totalWeight = 0;
        
        for (Suitcase s : suitcases) {
            totalWeight = totalWeight + s.totalWeight();
        }
        
        return suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
    
    public void printItems() {
        
        for (Suitcase suitcase:suitcases) {
            suitcase.printItems();
        }
    }
}
