import java.util.ArrayList;

public class MessagingService {
    ArrayList<Message> messages;
    
    public MessagingService() {
        this.messages = new ArrayList<>();
    }
    
    public void add(Message message) {
        // Get length of message
        int length = message.getContent().length();
        
        // If length less than 281, store message in messages
        if (length <= 280) {            
            this.messages.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
