import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Ellipse2D.Double
{
    public Circle (double ex, double cy, double radius){
        super (ex, cy, radius*2, radius*2);
    }
    
    public double getRadius(){
        return super.getWidth() / 2;
    }
    
    public void draw(Graphics2D g2){
        g2.draw (this);
    }
    
    public void translate(double dx, double dy){
        x = super.getX() + dx;
        y = super.getY() + dy;
    }
}
