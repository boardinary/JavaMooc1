
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }
        
        if (cents < 0) {
            euros = euros - cents / 100 - 1;
            cents = 100 - -1 * cents % 100;
        }

        if (euros < 0) {
            this.euros = 0;
            this.cents = 0;
            return;
        }
        
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(addition.euros + this.euros, addition.cents +
                this.cents);

        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros) {
            return false;
        }
        
        if (this.euros == compared.euros && this.cents > compared.cents) {
            return false;
        }
        
        return true;
    }
    
    public Money minus(Money decreaser) {
        Money newMoney = new Money(this.euros - decreaser.euros, this.cents -
                decreaser.cents);
        return newMoney;
    }
}
