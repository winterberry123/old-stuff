import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.control.ScrollPane;

/**
 *
 * @author mark_anro, Joyce Chen
 */

public class Connect4Main extends Application 
{
 
    /**
     * @param args the command line arguments
     */
     
    private SimpleObjectProperty<Color> playerColorProperty = new SimpleObjectProperty<Color>(Color.RED);
    private int r;
    private int c;
     
     
    public static void main(String[] args) {
        launch(args);
    }
     
    @Override
    public void start(Stage primaryStage) {
         
        final BorderPane root = new BorderPane();
        final GridPane gridpane = new GridPane();
        primaryStage.setTitle("JavaFX Connect Four");
        primaryStage.setResizable(true);
         
        final Button addCellButton = new Button("Increase Grid Size");
        addCellButton.setFont (Font.font ("Times New Roman", 15));
        
        final Button rulesButton = new Button ("Basic Guidelines");
        rulesButton.setFont (Font.font ("Times New Roman", 15));
        rulesButton.setOnAction(e -> Guidelines.display());
        
        final Button redButton = new Button ("Red Count");
        redButton.setFont (Font.font ("Times New Roman", 15));
        
        Label red = new Label ();
        WinCount redWin = new WinCount ();
        redButton.setOnAction(e -> {
            red.setText("Red Won: "+ redWin.count() + " times");
        });
        
        final Button yellowButton = new Button ("Yellow Count");
        yellowButton.setFont (Font.font ("Times New Roman", 15));
        
        Label yellow = new Label ();
        WinCount yellowWin = new WinCount ();
        yellowButton.setOnAction(e -> {
            yellow.setText("Yellow Won: "+ yellowWin.count() + " times");
        });
        
        final Button startOver = new Button ("Start Over");
        startOver.setFont(Font.font("Times New Roman", 15));
        startOver.setOnAction(e -> {
            createGrids (gridpane);
        });
        
        Scene scene = new Scene(root, 800, 800, true);
        scene.setFill(Color.BLACK);
         
        gridpane.setTranslateY(20);
        gridpane.setAlignment(Pos.CENTER);
         
        gridpane.getColumnConstraints().addAll(new ColumnConstraints(100,100,Double.MAX_VALUE), 
                new ColumnConstraints(100,100,Double.MAX_VALUE),
                new ColumnConstraints(100,100,Double.MAX_VALUE),
                new ColumnConstraints(100,100,Double.MAX_VALUE));
        gridpane.getRowConstraints().addAll(new RowConstraints(100,100,Double.MAX_VALUE), 
                new RowConstraints(100,100,Double.MAX_VALUE),
                new RowConstraints(100,100,Double.MAX_VALUE),
                new RowConstraints(100,100,Double.MAX_VALUE));
         
        createGrids(gridpane);
        
        VBox vbox = new VBox (10);
        vbox.setMargin (rulesButton, new Insets(50,0,0,10));
        vbox.setMargin (addCellButton, new Insets(0,0,0,10));
        vbox.setMargin (redButton, new Insets(10,0,0,10));
        vbox.setMargin (red, new Insets(0,0,0,10));
        vbox.setMargin (yellowButton, new Insets(0,0,0,10));
        vbox.setMargin (yellow, new Insets(0,0,0,10));
        vbox.setMargin (startOver, new Insets(0,0,0,10));
        vbox.getChildren().addAll (rulesButton, addCellButton, redButton, red, yellowButton, yellow, startOver);
        
        root.setCenter(gridpane);
        root.setLeft (vbox);
         
        addCellButton.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
                addGrid(gridpane);
            }
        });
      
           
        
  
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.show();
    }
     
    //Add Column and Row
    private void addGrid(final GridPane gridpane){
        gridpane.getColumnConstraints().addAll(new ColumnConstraints(100,100,Double.MAX_VALUE));
        gridpane.getRowConstraints().addAll(new RowConstraints(100,100,Double.MAX_VALUE));
        createGrids(gridpane);
    }
     
    //Create Grids
    private void createGrids(final GridPane gridpane){
        gridpane.getChildren().clear();
        for(r=0;r<gridpane.getColumnConstraints().size(); r++){
            for(c=0; c<gridpane.getColumnConstraints().size(); c++){
                 
            Rectangle rect = new Rectangle(100,100);
            Circle circ = new Circle(40);
            circ.centerXProperty().set(50);
            circ.centerYProperty().set(50);
            Shape cell = Path.subtract(rect, circ);
            cell.setFill(Color.BLUE);
            cell.setStroke(Color.BLUE);
            cell.setOpacity(.8);
             
             
            final Circle diskPreview = new Circle(40);
            diskPreview.setOpacity(.5);
            diskPreview.setFill(Color.TRANSPARENT);
             
            diskPreview.setOnMouseEntered(new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent arg0) {
                    diskPreview.setFill(Color.WHITE);
                    if(playerColorProperty.get()==Color.RED){
                        diskPreview.setFill(Color.RED);
                    }else{
                        diskPreview.setFill(Color.YELLOW);
                    }
                }
            });
             
            diskPreview.setOnMouseExited(new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent arg0) {
                    diskPreview.setFill(Color.TRANSPARENT);
                }
            });
             
            final Circle disk = new Circle(40);
            disk.fillProperty().bind(playerColorProperty);
            disk.setOpacity(.8);
            disk.setTranslateY(-(100*(r+1)));
             
             
            final TranslateTransition translateTranstion = new TranslateTransition(Duration.millis(300), disk);
             
            disk.setOnMouseEntered(new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent arg0) {
                    diskPreview.setFill(Color.WHITE);
                    if(playerColorProperty.get()==Color.RED){
                        diskPreview.setFill(Color.RED);
                    }else{
                        diskPreview.setFill(Color.YELLOW);
                    }
                }
            });
             
            disk.setOnMouseExited(new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent arg0) {
                    diskPreview.setFill(Color.TRANSPARENT);
                }
            });
             
            disk.setOnMouseClicked(new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent arg0) {
                    if(disk.getTranslateY()!=0){
                        translateTranstion.setToY(0);
                        translateTranstion.play();
                        if(playerColorProperty.get()==Color.RED){
                            playerColorProperty.set(Color.YELLOW);
                            disk.fillProperty().bind(new SimpleObjectProperty<Color>(Color.RED));
                        }else{
                            playerColorProperty.set(Color.RED);
                            disk.fillProperty().bind(new SimpleObjectProperty<Color>(Color.YELLOW));
                        }
                    }
                }
            });
             
            diskPreview.setOnMouseClicked(new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent arg0) {
                    if(disk.getTranslateY()!=0){
                        translateTranstion.setToY(0);
                        translateTranstion.play();
                        if(playerColorProperty.get()==Color.RED){
                            playerColorProperty.set(Color.YELLOW);
                            disk.fillProperty().bind(new SimpleObjectProperty<Color>(Color.RED));
                        }else{
                            playerColorProperty.set(Color.RED);
                            disk.fillProperty().bind(new SimpleObjectProperty<Color>(Color.YELLOW));
                        }
                    }
                }
            });
             
             
            StackPane stack = new StackPane();
             
            stack.getChildren().addAll(cell, diskPreview, disk);
             
            gridpane.add(stack, c, r); 
             
               
            }
             
        }
    }
} 
