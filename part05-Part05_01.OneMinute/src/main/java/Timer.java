public class Timer{
    private ClockHand seconds;
    private ClockHand hundredths;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredths = new ClockHand(100);
    }
    
    public void advance() {
        //advance hundredths
        this.hundredths.advance();
        
        // Check to see if hundredths reset needed
        
        if (this.hundredths.value() >= 99) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        // Format values to 00:00 format
        String second = String.format("%02d", this.seconds.value());
        String hundred = String.format("%02d", this.hundredths.value());

        return second + ":" + hundred;
    }
}