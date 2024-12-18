package hust.soict.dsai.aims.media;

public class Track implements Playable {
    // Fields
    private String title;
    private int length;

    // Constructors
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    // Implement play() method
    @Override
    public void play() {
        if (length > 0) {
            System.out.println("Playing track: " + title);
            System.out.println("Track length: " + length + " minutes");
        } else {
            System.out.println("Error: Track \"" + title + "\" has an invalid length.");
        }
    }

    // Override equals() 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check for reference equality
        if (!(obj instanceof Track)) return false; // Check for type compatibility
        Track other = (Track) obj; // Cast to Track
        return title != null && title.equalsIgnoreCase(other.title) && length == other.length; // Compare title and length
    }

    // Override toString
    @Override
    public String toString() {
        return String.format("Track: %s (%d minutes)", title, length);
    }
}
