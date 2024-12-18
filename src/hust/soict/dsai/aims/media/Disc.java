package hust.soict.dsai.aims.media;

public class Disc extends Media {
    // Specific attributes
    private int length;

    // Constructor 
    public Disc(int id, String title, String category, float cost, int length) {
        super(id, title, category, cost);
        this.length = length;
    }

    // Getters and Setters
    public int getLength() {
        return length;
    }

    // Implement toString to comply with Media's abstract method
    @Override
    public String toString() {
        return String.format("Disc - %s - %s - %s - %d: %.2f $",
                getTitle(), getCategory(), length, getCost());
    }
}
