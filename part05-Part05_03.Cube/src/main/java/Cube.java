
import java.lang.Math;

public class Cube {

    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume() {
        return (int) Math.pow((double) this.edgeLength, 3);
    }
    
    public String toString() {
        return "The length of the edge is " + this.edgeLength +
                " and the volume is " + volume();
    }
}
