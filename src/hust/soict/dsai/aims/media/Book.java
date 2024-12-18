package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    // Specific Attributes
    private List<String> authors = new ArrayList<>();

    // Constructor
    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost); // Calls Media constructor
    }

    public Book(String title, String category, float cost) {
		// TODO Auto-generated constructor stub
    	super(title, category, cost);
	}

	// Getter for authors
    public List<String> getAuthors() {
        return new ArrayList<>(authors); // Return a copy to protect internal list
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    // Method to add an author
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author \"" + authorName + "\" has been added to the book.");
        } else {
            System.out.println("Author \"" + authorName + "\" is already in the author list.");
        }
    }

    // Method to remove an author
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author \"" + authorName + "\" has been removed from the book.");
        } else {
            System.out.println("Author \"" + authorName + "\" is not in the author list.");
        }
    }

    // Override toString
    @Override
    public String toString() {
        return String.format("Book - %s - %s - Authors: %s - %.2f $", getTitle(), getCategory(), authors, getCost());
    }
}
