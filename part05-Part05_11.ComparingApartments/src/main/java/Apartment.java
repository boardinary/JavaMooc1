import java.lang.Math;

public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        return Math.abs(this.princePerSquare * this.squares - compared.squares *
                compared.princePerSquare);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.princePerSquare * this.squares > compared.princePerSquare *
                compared.squares) {
            return true;
        }
        
        return false;
    }
}
