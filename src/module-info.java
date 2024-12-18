/**
 * 
 */
/**
 * 
 */
module AimsProject {
	requires javafx.base;
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.swing;
	requires javafx.controls;
	requires java.naming;
	
    opens hust.soict.dsai.aims.screen to javafx.fxml;
    opens hust.soict.dsai.aims.media to javafx.base;

    exports hust.soict.dsai.aims.screen;
}