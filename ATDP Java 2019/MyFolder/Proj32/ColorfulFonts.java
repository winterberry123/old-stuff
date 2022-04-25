import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ColorfulFonts extends Application
{
    @Override
    public void start(Stage primaryStage) {
        // Create a border pane
        BorderPane pane = new BorderPane();
        
        // Place nodes in the pane
        pane.setTop(fonts());
        // pane.setLeft(getVBox());
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowHBox"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    
    private HBox fonts() {
        
        HBox words = new HBox(15);
        words.setPadding(new Insets(15, 15, 15, 15));
        
        Text text1 = new Text(10,10,"Hello");
        text1.setFont (Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        Color c1 = new Color (Math.random(),Math.random(),Math.random(),Math.random());
        text1.setFill(c1);
        text1.setRotate(90);
        words.getChildren().add(text1);
        
        Text text2 = new Text(20,10,"Hello");
        Color c2 = new Color (Math.random(),Math.random(),Math.random(),Math.random());
        text2.setFont (Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        text2.setFill(c2);
        text2.setRotate(90);
        words.getChildren().add(text2);
        
        Text text3 = new Text(30,10,"Hello");
        Color c3 = new Color (Math.random(),Math.random(),Math.random(),Math.random());
        text3.setFont (Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        text3.setFill(c3);
        text3.setRotate(90);
        words.getChildren().add(text3);
        
        Text text4 = new Text(40,10,"Hello");
        Color c4 = new Color (Math.random(),Math.random(),Math.random(),Math.random());
        text4.setFont (Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        text4.setFill(c4);
        text4.setRotate(90);
        words.getChildren().add(text4);
        
        Text text5 = new Text(50,10,"Hello");
        Color c5 = new Color (Math.random(),Math.random(),Math.random(),Math.random());
        text5.setFont (Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        text5.setFill(c5);
        text5.setRotate(90);
        words.getChildren().add(text5);
        
        return words;
    }
}
