
public class Main {

    public static void main(String[] args) {

        Message m = new Message("alex", "hello world");
        
        MessagingService mservice = new MessagingService();
        
        mservice.add(m);
        
        mservice.getMessages();
               
    }
}
