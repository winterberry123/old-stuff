import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;
/**
 * Write a description of class OlympicLogo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OlympicLogo extends Circle
{
    private float ringThickness;
    
    public OlympicLogo(double ex, double cy, double radius){
        super (ex, cy, radius);
        ringThickness = (float)(radius/5);
    }
    
    public void draw(Graphics2D g2){
        g2.setColor(Color.BLUE);
        super.draw(g2);
        super.translate (super.getRadius()*2,0);
        g2.setColor(Color.BLACK);
        super.draw(g2);
        super.translate (super.getRadius()*2,0);
        g2.setColor(Color.RED);
        super.draw(g2);
        super.translate (super.getRadius()-super.getRadius()*4.25,super.getRadius()/0.8);
        g2.setColor(Color.GREEN);
        super.draw(g2);
        super.translate (super.getRadius()*2.5,0);
        g2.setColor(Color.YELLOW);
        super.draw(g2); 
        
        g2.setStroke(new BasicStroke(ringThickness));
    }
}