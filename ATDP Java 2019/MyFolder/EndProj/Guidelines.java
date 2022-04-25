import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.control.ScrollPane;


public class Guidelines {
   
    
    public static void display()
    {
            Stage popupwindow = new Stage();
            ScrollPopUp scrollpopup = new ScrollPopUp ();
            
            popupwindow.initModality(Modality.APPLICATION_MODAL);
            popupwindow.setTitle("Rules");
            
            Scene scene1= new Scene(scrollpopup, 600, 500);
        
            popupwindow.setScene(scene1);
                  
            popupwindow.showAndWait();
                   
        }
    
    }
