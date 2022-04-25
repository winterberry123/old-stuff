import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

/**
 * Write a description of class PopUp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScrollPopUp extends BorderPane
{
   public ScrollPopUp(){
       
            Label label = new Label ("BASIC RULES");
            label.setFont (Font.font (20));
            Label label1= new Label("1) Connect 4 of same colored circle either horizontally, vertically, or horizontally to win. ");
            Label label2 = new Label("2) You can click at the top where the circle is to place it in the column you want...");
            Label label3 = new Label("        3) or just click the spot on the grid that you want to put the disk in (both options have a preview).");
            Label label4 = new Label ("4) You can also increase the size of the grid. This starts the game over.");
            Label label5 = new Label ("~^^this is what the the bigger grid looks like^^~");
            Label label6 = new Label("7) Now, last but not least, REMEMBER TO HAVE FUN!!! :)");
            Label label7 = new Label ("   5) When you connect 4 of the same circles, click on the color count button to keep track of your scores.");
            Label label8 = new Label ("6) After a game, click start over to clear the grid.");
                 
            
               
            ImageView image1 = new ImageView("1.png");
            image1.setFitHeight(200);
            image1.setFitWidth(200);
            ImageView image2 = new ImageView("2.jpg");
            image2.setFitHeight(200);
            image2.setFitWidth(200);
            ImageView image3 = new ImageView("3.jpg");
            image3.setFitHeight(225);
            image3.setFitWidth(225);
            ImageView image4 = new ImageView("4.jpg");
            image4.setFitHeight(200);
            image4.setFitWidth(200);
            ImageView image5 = new ImageView("5.jpg");
            image5.setFitHeight(200);
            image5.setFitWidth(200);
            ImageView image6 = new ImageView("6.jpg");
            image6.setFitHeight(200);
            image6.setFitWidth(200);
            ImageView image7 = new ImageView("7.jpg");
            image7.setFitHeight(200);
            image7.setFitWidth(200);
            ImageView image8 = new ImageView("8.jpg");
            image8.setFitHeight(200);
            image8.setFitWidth(200);
            
            VBox layout= new VBox(10);
            layout.setMargin (label8, new Insets(10,0,30,5));    
            layout.setMargin (label, new Insets (10, 50, 10, 50));
            layout.getChildren().addAll(label, image2, label1, image5, label2, image4, label3, image3, label4, image1, label5, image6, label7, image7, image8, label8, label6);
            
            
            ScrollPane scrollPane = new ScrollPane (layout);
            layout.setAlignment (Pos.CENTER);
            setCenter(scrollPane);
            scrollPane.setStyle("-fx-background-color:transparent;");
            scrollPane.setStyle("-fx-background: rgb(204,204,255);");
            setPadding (new Insets(30,5,30,5));
    }
}
