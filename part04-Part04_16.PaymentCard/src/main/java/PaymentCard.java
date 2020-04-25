/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        // Check to see if sufficient balance
        if (this.balance < 2.60) {
            return;
        }

        this.balance = this.balance - 2.60;
    }

    public void eatHeartily() {
        // Check for sufficent balance
        if (this.balance < 4.60) {
            return;
        }
        this.balance = this.balance - 4.60;
    }

    public void addMoney(double amount) {

        // Ignore negative amounts
        if (amount < 0) {
            return;
        }
        
        // Do not exceed 150 balance
        if (this.balance + amount > 150) {
            this.balance = 150;
        } else {
            this.balance = this.balance + amount;
        }
    }
}
