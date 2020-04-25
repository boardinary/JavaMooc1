import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    
    private ArrayList<String> jokeList;
    
    public JokeManager() {
        this.jokeList = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokeList.add(joke);
    }
    
    public String drawJoke() {
        if (this.jokeList.isEmpty()) {
            return "Jokes are in short supply.";
        }
        
        Random random = new Random();
        int index = random.nextInt(jokeList.size());
        return jokeList.get(index);
    }
    
    public void printJokes() {
        for (String joke : jokeList) {
            System.out.println(joke);
        }
    }
}
