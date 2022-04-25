import javafx.application.Application; 
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button; 
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MoveTheBall extends Application
{
    private MoveTheBallPane ball = new MoveTheBallPane();
    
    public void start(Stage primaryStage) { 
        // Hold two buttons in an HBox 
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btUp = new Button("Up");
        Button btDown = new Button("Down"); 
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right"); 
        hBox.getChildren().add(btUp);
        hBox.getChildren().add(btDown);
        hBox.getChildren().add(btLeft);
        hBox.getChildren().add(btRight);
        
        // Create and register the handler
        btUp.setOnAction(e -> ball.moveUp());
        btDown.setOnAction(e -> ball.moveDown());
        btLeft.setOnAction(e -> ball.moveLeft());
        btRight.setOnAction(e -> ball.moveRight());
        
        // ball.setOnMouseClicked(e -> {
            // if (e.getButton() == MouseButton.PRIMARY) {
                // ball.moveUp(); 
            // }
            // else if (e.getButton() == MouseButton.SECONDARY) { 
                // ball.moveDown();
            // }
            // else if (e.getButton() == MouseButton.MIDDLE) {
                // ball.moveLeft(); 
            // }
            // else if (e.getButton() == MouseButton.SECONDARY) { 
                // ball.moveRight();
            // }
        // });
        
        ball.setOnKeyPressed(e -> { 
            if (e.getCode() == KeyCode.UP) { 
                ball.moveUp();
            }
            else if (e.getCode() == KeyCode.DOWN) { 
                ball.moveDown();
            } 
            else if (e.getCode() == KeyCode.LEFT) { 
                ball.moveLeft();
            } 
            else if (e.getCode() == KeyCode.RIGHT) { 
                ball.moveRight();
            } 
        });
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(ball);
        borderPane.setBottom(hBox); 
        BorderPane.setAlignment(hBox, Pos.CENTER); 
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 200, 150);
        primaryStage.setTitle("Moving Circle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        
        ball.requestFocus(); // Request focus on circlePane
    } 
}
