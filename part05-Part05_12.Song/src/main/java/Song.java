
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Song song) {
        if (this.artist.equals(song.artist) == false) {
            return false;
        } else if (this.name.equals(song.name) == false) {
            return false;
        } else if (this.durationInSeconds != song.durationInSeconds) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
