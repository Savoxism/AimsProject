package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    // Class variable for unique ID tracking
    private static int nbDigitalVideoDiscs = 0;
    private String director;

    // Constructor
    public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
        super(nbDigitalVideoDiscs, title, category, cost, length);
         // Call Disc constructor
        nbDigitalVideoDiscs++;
        this.director = director;
    }
    

    // Getters and Setters
    public String getDirector() {
        return director;
    }

    // Implement play() method
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength() + " minutes");
    } 

    // Override toString for DigitalVideoDisc details
    @Override
    public String toString() {
        return String.format("DVD - %s - %s - %s - %d: %.2f $", getTitle(), getCategory(), getDirector(), getLength(), getCost());
    }

    // isMatched() method to check if a DigitalVideoDisc matches a search term
    public boolean isMatched(String title) {
        return getTitle().toLowerCase().contains(title.toLowerCase());
    }

    // Override compareTo for sorting by title then decreasing length, then cost
    @Override
    public int compareTo(Media other) {
        if (other instanceof DigitalVideoDisc) {
            DigitalVideoDisc dvd = (DigitalVideoDisc) other;

            // First criteria: title
            int titleComparison = this.getTitle().compareToIgnoreCase(dvd.getTitle());
            if (titleComparison != 0) { // If titles are different
                return titleComparison;
            }
            
            // Second criteria: length
            int lengthComparison = Integer.compare(dvd.getLength(), this.getLength());
            if (lengthComparison != 0) { // If lengths are different
                return lengthComparison;
            }

            // Third criteria: cost
            return Float.compare(dvd.getCost(), this.getCost()); // Sort by cost
        }

        // If `other` is not a DigitalVideoDisc, fall back to Media comparison
        return super.compareTo(other);
    }
}
