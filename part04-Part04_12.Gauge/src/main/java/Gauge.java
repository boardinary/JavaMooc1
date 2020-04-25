/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class Gauge {
    private int value;
    
    public Gauge() {
        this.value = 0;
    }
    
    public void increase() {
        
        // Increase value up to 5
        if (this.value < 5) {
            this.value++;
        }
    }
    
    public void decrease() {
        
        // Decrease value down to 0
        if (this.value > 0) {
            this.value--;
        }
    }
    
    public int value() {
        return this.value;
    }
    
    public boolean full() {
        // Return true if full
        if (this.value == 5) {
            return true;
        }
        
        return false;
    }
}
