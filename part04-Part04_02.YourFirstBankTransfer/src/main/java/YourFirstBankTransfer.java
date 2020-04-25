
public class YourFirstBankTransfer {

    public static void main(String[] args) {

        // Create accounts
        Account matthewsAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);
        
        // Withdraw
        matthewsAccount.withdrawal(100);
        myAccount.deposit(100);
        
        // Print both accounts
        System.out.println(matthewsAccount);
        System.out.println(myAccount);

    }
}
