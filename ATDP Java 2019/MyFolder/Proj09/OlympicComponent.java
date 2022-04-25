import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
/**
 * Write a description of class OlympicComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OlympicComponent extends JComponent
{
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        OlympicLogo oly1 = new OlympicLogo (10.0,10.0,15.0);
        oly1.draw(g2);
        OlympicLogo oly2 = new OlympicLogo (100.0, 50.0, 20.0);
        oly2.draw(g2);
        OlympicLogo oly3 = new OlympicLogo (200.0, 200.0, 25.0);
        oly3.draw(g2);
}
}
