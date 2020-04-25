import java.util.ArrayList;

package default package;

public class Package {
    private ArrayList<Gift> gifts;
    private int weight;
    
    public Package() {
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        gifts.add(gift);
        this.weight = this.weight + gift.getWeight();
    }
    
    public int totalWeight() {
        return this.weight;
    }
}
