import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * This component draws a few cars.
 * @author Joyce Chen
 * @version 1.0
*/
public class HouseComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      
      int houseWidth = 20;
      House firstHouse = new House (0,0,houseWidth);
      firstHouse.draw (g2);
      
      houseWidth = 50;
      House secondHouse = new House (60,60,houseWidth);
      secondHouse.draw (g2);
    }}