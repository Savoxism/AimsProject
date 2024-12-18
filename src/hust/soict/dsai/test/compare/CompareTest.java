package hust.soict.dsai.test.compare;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CompareTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

		// create some media here
		// for example: cd, dvd, book
        CompactDisc cd1 = new CompactDisc("Son Tung MTP", "Classic", 24.55f, 0, "Son Tung MTP");
        CompactDisc cd2 = new CompactDisc("Amee", "Unknown", 0.0f, 0, "Unknown");


        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 19.95f, 87, "Roger Allers");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f, 87, "George Lucas");


		Book b1 = new Book("1 Van Cau Hoi Vi sao", "Truyen", 80.25f);
		Book b2 = new Book("So Dua", "Truyen Co Tich", 40.5f);

        // Sort by Title, then Cost
        cart.sortByTitleCost();

        System.out.println("");

        // Sort by Cost, then Title
        cart.sortByCostTitle();
    }
}