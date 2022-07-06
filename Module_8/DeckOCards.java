//Paul Caron
//6-29-22
//Module 8 Assignment
//Store images of cards in the card directory
//Use cards from card directory and display four random cards

/*
java2s.com. (n.d.). Java Array select random cards from deck. java2s.com.
     http://www.java2s.com/ref/java/java-array-select-random-cards-from-deck.html
Oracle (Ed.). (n.d.). How to Make Frames (Main Windows). Oracle Java
     Documentation. https://docs.oracle.com/javase/tutorial/uiswing/components/
     frame.html
uchiha1101. (2021, January 7). Getting Random Elements from ArrayList in Java.
     GeeksforGeeks. https://www.geeksforgeeks.org/
     getting-random-elements-from-arraylist-in-java/  
*/

import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

    
public class DeckOCards extends Application{

	// main method
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
    	// title the window
        primaryStage.setTitle("DeckOCards");
        
        // array list of all the cards
        ArrayList<String> cards = new ArrayList<>();
        for(int i = 0; i < 52; i++){
        	cards.add(String.valueOf(i + 1));
        }
        // shuffle the arraylist so different cards are picked
        Collections.shuffle(cards);
        // gets image from cards folder and assign a variable name to it
        ImageView card1 = new ImageView(new Image("Cards\\" + cards.get(0) + ".png"));
        ImageView card2 = new ImageView(new Image("Cards\\" + cards.get(1) + ".png"));
        ImageView card3 = new ImageView(new Image("Cards\\" + cards.get(2) + ".png"));
        ImageView card4 = new ImageView(new Image("Cards\\" + cards.get(3) + ".png"));
        // lay out the kids horizontally
        HBox root = new HBox();
        // places the kids on the screen
        root.getChildren().add(card1);
        root.getChildren().add(card2);
        root.getChildren().add(card3);
        root.getChildren().add(card4);
        // creates and sets the size of the window and displays it      
        Scene scene = new Scene(root, 300, 250, Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.sceneProperty();
        primaryStage.show();
    }

	
    
}
