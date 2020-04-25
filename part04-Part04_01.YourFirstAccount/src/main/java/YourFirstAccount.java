
public class YourFirstAccount {

    public static void main(String[] args) {

        // Create an account with 100 balance
        Account myAccount = new Account("alex", 100.0);
        
        myAccount.deposit(20);
        
        System.out.println(myAccount);
    }
}
