package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Store {
    // Field to store Media items in the store
    private ArrayList<Media> itemsInStore;

    // Constructor
    public Store() {
        itemsInStore = new ArrayList<>();
    } 
    
    // Getter to get items
    public ArrayList<Media> getItemsInStore() {
    	return this.itemsInStore ;
    }

    // Method to add a Media item to the store
    public void addMedia(Media media) {
        for (Media item : itemsInStore) {
            if (item.getTitle().equalsIgnoreCase(media.getTitle())) {
                System.out.println("The media \"" + media.getTitle() + "\" already exists in the store.");
                return; // Exit method if the media already exists
            }
        }
        itemsInStore.add(media);
        System.out.println("The media \"" + media.getTitle() + "\" has been added to the store.");
    }

    // Method to remove a Media item from the store 
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("The media \"" + media.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" is not in the store.");
        }
    }

   // Method to display all items in the store
   public void displayStore() {
    System.out.println("***********************STORE************************");
    System.out.println("Available Items:");
    for (int i = 0; i < itemsInStore.size(); i++) {
        System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
    }
    System.out.println("***************************************************");
    }

    // Search media by title
    public Media searchByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null; // Return null if no media with the specified title is found
    }

    // Search media by ID
    public Media searchById(int id) {
        for (Media media : itemsInStore) {
            if (media.getId() == id) {
                return media;
            }
        }
        return null; // Return null if no media with the specified ID is found
    }

}