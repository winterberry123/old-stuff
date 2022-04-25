import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * This class is for a house that can be positioned anywhere on the screen,
 * and of any size.
 * 
 * @author Joyce Chen
 * @verion 1.0
*/
public class House
{
    private int xCoor;
    private int yCoor;
    private int number;
    
    /**
     * Constructs a house with a given top left corner.
     * @param x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     * @param length the width of the house
     */
    public House (int x, int y , int length) {
        xCoor = x;
        yCoor = y;
        number = length;
    }
   /**
    * Draws the house.
    * @param g2 the graphics content
    */
   public void draw(Graphics2D g2)
   {
      Rectangle body = new Rectangle (xCoor, yCoor + number, number, number);
       
      Point2D.Double point1 = new Point2D.Double(xCoor + number/2, yCoor);
      Point2D.Double point2 = new Point2D.Double(xCoor, yCoor + number);
      Point2D.Double point3 = new Point2D.Double(xCoor + number, yCoor + number);
      
      Line2D.Double firstSide = new Line2D.Double(point1, point2);
      Line2D.Double secondSide = new Line2D.Double(point2, point3);
      Line2D.Double thirdSide = new Line2D.Double(point1, point3);
      
      g2.draw (body);
      g2.draw (firstSide);
      g2.draw (secondSide);
      g2.draw (thirdSide);
}}