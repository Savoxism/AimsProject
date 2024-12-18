package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        int titleComparision = media1.getTitle().compareToIgnoreCase(media2.getTitle());
        if (titleComparision != 0) {
            return titleComparision; // Compare by title
        }
        return Float.compare(media2.getCost(), media1.getCost()); // Descending order by cost
    }
}
