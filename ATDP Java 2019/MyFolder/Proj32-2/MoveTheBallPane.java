import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Write a description of class MoveTheBallPane here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MoveTheBallPane extends StackPane {
    private Circle circle = new Circle(10.0,10.0,30.0);
    
    public MoveTheBallPane() { 
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
    }

    
    public void moveLeft() { 
        circle.setCenterX(circle.getCenterX() + 5);
    } 
    
    public void moveRight() { 
        circle.setCenterX(circle.getCenterX() + 5);
    }
    
    public void moveUp() { 
        circle.setCenterY(circle.getCenterY() - 5);
    }
    
    public void moveDown() { 
        circle.setCenterY(circle.getCenterY() + 5);
    }
}
