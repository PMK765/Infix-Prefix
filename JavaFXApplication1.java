/*
The First Peter-Jordan Project
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
//import javafx.scene.


public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        Button btn = new Button();
        TextField tf = new TextField();
        Label l = new Label();
        l.setText("HERES WHERE STRING GOES");
        tf.setText("");
        
        
        btn.setText("Send String to Label");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) 
            {
                //Here's where we're putting our shit
                //System.out.println("Eat a delicious pizza");
                String convertedval = " ";
                convertedval = tf.getText();
                l.setText(convertedval);
            }
        });
        
        GridPane grid = new GridPane();
        GridPane.setConstraints(btn,10,150);
        GridPane.setConstraints(tf,10,50);
        GridPane.setConstraints(l,10,10);
        grid.setPadding(new Insets(20,20,200,20)); 
        
        grid.getChildren().addAll(btn, tf, l);
        
        
        Scene scene = new Scene(grid, 300, 250);
        
        primaryStage.setTitle("What's on the menu?");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
