
public class Container {
    private int fill;
    private int capacity;
    
    public Container() {
        this.fill = 0;
        this.capacity = 100;
    }
    
    public int contains() {
        return this.fill;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        
        if (amount + this.fill > this.capacity) {
            this.fill = this.capacity;
        } else {
            this.fill += amount;
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        
        if (this.fill - amount < 0) {
            this.fill = 0;
        } else {
            this.fill -= amount;
        }        
    }
    
    public String toString() {
        return this.fill + "/" + this.capacity;
    }
}
