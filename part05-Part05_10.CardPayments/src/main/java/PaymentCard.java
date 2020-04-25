
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {

        // return false if insufficient balance
        if (this.balance < amount) {
            return false;
        }
        
        this.balance = this.balance - amount;
        return true;       
    }
}
