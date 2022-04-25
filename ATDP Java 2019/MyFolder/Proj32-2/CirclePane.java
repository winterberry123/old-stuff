import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

class CirclePane extends StackPane {
    private Circle circle = new Circle(50);
    
    public CirclePane() { 
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
    }

    
    public void enlarge() { 
        circle.setRadius(circle.getRadius() + 2);
    } 
    
    public void shrink() { 
        System.out.println(circle.getRadius());
        circle.setRadius(circle.getRadius() > 2 ? 
                         circle.getRadius() - 2 : circle.getRadius()); 
    }
}