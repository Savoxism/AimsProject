// package hust.soict.dsai.test.cart;

// import hust.soict.dsai.aims.cart.Cart;
// import hust.soict.dsai.aims.media.DigitalVideoDisc;

// public class CartTest {
//     public static void main(String[] args) {
//         // Create sample DVDs
//         DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Disney", 90, 19.99f);
//         DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 29.99f);
//         DigitalVideoDisc dvd3 = new DigitalVideoDisc("Avengers", "Action", "Joss Whedon", 120, 24.99f);

//         // Create a cart
//         Cart cart = new Cart();

//         // Add DVDs to the cart
//         cart.addDigitalVideoDisc(dvd1);
//         cart.addDigitalVideoDisc(dvd2, dvd3);

//         // Display the cart
//         System.out.println("\nDisplaying the cart:");
//         cart.displayCart();

//         // Search for DVDs by ID and title
//         System.out.println("\nSearching for DVD with ID: 2");
//         cart.search(2);

//         System.out.println("\nSearching for DVD with title containing 'Lion'");
//         cart.search("Lion");

//         System.out.println("\nSearching for DVD with title containing 'Matrix'");
//         cart.search("Matrix");

//         // Remove a DVD and display the cart again
//         System.out.println("\nRemoving 'Inception' from the cart:");
//         cart.removeDigitalVideoDisc(dvd2);

//         System.out.println("\nDisplaying the cart after removal:");
//         cart.displayCart();
//     }
// }
