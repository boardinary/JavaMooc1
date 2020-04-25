import java.util.ArrayList;

public class Room {
    ArrayList<Person> list;
    
    public Room() {
        list = new ArrayList<>();
    }
    
    public void add(Person person) {
        list.add(person);
    }
    
    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Person> getPersons() {
        return list;
    }
    
    public Person shortest() {
        int height = 1000;
        Person shortestPerson = null;
        
        if (list.isEmpty()) {
            return shortestPerson;
        }
        
        for (Person person:list) {
            if (person.getHeight() < height) {
                height = person.getHeight();
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }
    
    public Person take() {
        
        if (list.isEmpty()) {
            return null;
        }
        
        Person shortestPerson = this.shortest();
        this.list.remove(this.shortest());
        
        return shortestPerson;
    }
}
