package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

// import java.util.ArrayList;
import java.util.Collections;

import javax.naming.LimitExceededException;

public class Cart {
    // Attributes
    public static final int MAX_NUMBERS_ORDERED = 20;
    public static ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

    // getter
    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
    

    public void addMedia(Media media) throws LimitExceededException {
		if ((itemsOrdered.size()) >= MAX_NUMBERS_ORDERED) {
			throw new LimitExceededException("Full");
		}
		else if (itemsOrdered.contains(media)) {
			System.out.println("This is already in your order!");
		}
		else {
			itemsOrdered.add(media);
			System.out.println("Media added!");
			}
	}

    // Method to remove a Media item from the cart
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("The media \"" + media.getTitle() + "\" has been removed from the cart.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" is not in the cart.");
        }
    }

    // Search media by ID
    public Media searchById(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                return media;
            }
        }
        return null; // Return null if no media with the specified ID is found
    }

    // Search media by title
    public Media searchByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null; // Return null if no media with the specified title is found
    }

    // Method to sort the cart by title then cost
    public void sortByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        System.out.println("Cart has been sorted by title and cost.");
    }

    // Method to sort items by cost then title
    public void sortByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        System.out.println("Cart has been sorted by cost and title.");
    }

    // Clear the cart
    public void clearCart() {
        itemsOrdered.clear();
        System.out.println("The cart has been emptied.");
    }

    // Method to calculate the total cost of items in the cart
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
    
    public Media takeById(int id) {
		boolean found = false;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getId() == id) {
				System.out.println("Media found: " + itemsOrdered.get(i).toString());
				found = true;
				return itemsOrdered.get(i);
			}
		}

		if (!found) {
			System.out.println("No Media found with ID: " + id);
		}
		return null;
	}

	public Media takeByTitle(String title) {
		boolean found = false;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getTitle().equals(title)) {
				System.out.println("Media found: " + itemsOrdered.get(i).toString());
				found = true;
				return itemsOrdered.get(i);
			}
		}

		if (!found) {
			System.out.println("No Media found with title: " + title);
		}
		return null;
	}
    
    // Method to display the cart
    public void displayCart() {
        System.out.println("***********************CART************************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.printf("Total cost: %.2f $\n", totalCost());
        System.out.println("***************************************************");
    }

}