
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number) {
        this.count++;
        // Add to sum
        this.sum = this.sum + number;
        
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        
        // If count is 0 return 0
        if (this.count == 0) {
            return 0;
        }
        
        return (double) this.sum / this.count;
    }
}
