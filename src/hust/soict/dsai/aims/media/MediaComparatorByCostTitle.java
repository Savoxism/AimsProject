package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        int costComparision = Float.compare(media2.getCost(), media1.getCost());
        if (costComparision != 0) {
            return costComparision; // Compare by cost
        }
        return media1.getTitle().compareToIgnoreCase(media2.getTitle()); // Ascending order by title
    }

}
