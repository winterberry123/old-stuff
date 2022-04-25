//BY JOYCE CHEN

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.BasicStroke;
import javax.swing.JComponent;


public class TotoroComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {
     Graphics2D g2 = (Graphics2D) g;
       
     //Background Color
     Rectangle background = new Rectangle (0,0,150,180);
     background.grow (150,150);
     Color newYellow = new Color (255,255,153);
     g2.setColor (newYellow);
     g2.fill (background);
       
     //Totoro's Body
     Color lightGray = new Color (153,153,153);
     g2.setColor(lightGray);
     Ellipse2D.Double body = new Ellipse2D.Double (30,50,220,260);
     g2.fill (body);
     g2.draw (body);
       
     //Totoro's Ears
     int[] xLeft = {70, 90, 110}; //x-coordinate of first point, second point
     int[] yLeft = {100, 5, 100};
     Polygon leftEar = new Polygon(xLeft, yLeft, 3);
     g2.fill (leftEar);
      
     int[] xRight = {165, 185, 205};
     int [] yRight = {100,5,100};
     Polygon rightEar = new Polygon (xRight, yRight, 3);
     g2.fill (rightEar);
       
     //Totoro's Eyes
     g2.setColor(Color.WHITE);
     Ellipse2D.Double leftEye = new Ellipse2D.Double (80,100,30,30);
     g2.fill (leftEye);
     Ellipse2D.Double rightEye = new Ellipse2D.Double (170,100,30,30);
     g2.fill (rightEye);
     
          //Totoro's Pupils
     g2.setColor(Color.BLACK);
     Ellipse2D.Double leftPupil = new Ellipse2D.Double (89,110,12,12);
     g2.fill (leftPupil);
     Ellipse2D.Double rightPupil = new Ellipse2D.Double (179,110,12,12);
     g2.fill (rightPupil);
      
     //Totoro's Nose
     Ellipse2D.Double nose = new Ellipse2D.Double (115,130,50,15);
     g2.fill (nose);
     
     //Totoro's Whiskers
     Line2D.Double whisker1 = new Line2D.Double (12,130,60,140);
     g2.draw(whisker1);
     Line2D.Double whisker2 = new Line2D.Double (10,150,60,150);
     g2.draw(whisker2);
     Line2D.Double whisker3 = new Line2D.Double (10,170,60,160);
     g2.draw(whisker3);
     Line2D.Double whisker4 = new Line2D.Double (210,140,260,130);
     g2.draw(whisker4);
     Line2D.Double whisker5 = new Line2D.Double (210,150,260,150);
     g2.draw(whisker5);
     Line2D.Double whisker6 = new Line2D.Double (210,160,260,170);
     g2.draw(whisker6);
     
     //Totoro's Tummy
     Ellipse2D.Double tummy = new Ellipse2D.Double (60,160,160,140);
     g2.setColor (Color.WHITE);
     g2.fill (tummy);
     
     //Totoro's Tummy Design (top)
     int[] triangle1x = {155, 145, 165};
     int [] triangle1y = {200,210,210};
     Polygon triangle1 = new Polygon (triangle1x, triangle1y, 3);
     g2.setColor(Color.BLACK);
     g2.fill (triangle1);
     
     int[] triangle2x = {125, 115, 135};
     int [] triangle2y = {200,210,210};
     Polygon triangle2 = new Polygon (triangle2x, triangle2y, 3);
     g2.fill (triangle2);
     
     int[] triangle4x = {95,85,105};
     int [] triangle4y = {200,210,210};
     Polygon triangle4 = new Polygon (triangle4x, triangle4y, 3);
     g2.fill (triangle4);
     
     int[] triangle3x = {185, 175, 195};
     int [] triangle3y = {200,210,210};
     Polygon triangle3 = new Polygon (triangle3x, triangle3y, 3);
     g2.fill (triangle3);
     
     //Totoro's tummy design (bottom)
     int[] triangle5x = {80, 70, 90};
     int [] triangle5y = {220,230,230};
     Polygon triangle5 = new Polygon (triangle5x, triangle5y, 3);
     g2.fill (triangle5);
     
     int[] triangle6x = {110, 100, 120};
     int [] triangle6y = {220,230,230};
     Polygon triangle6 = new Polygon (triangle6x, triangle6y, 3);
     g2.fill (triangle6);
     
     int[] triangle7x = {140, 130, 150};
     int [] triangle7y = {220,230,230};
     Polygon triangle7 = new Polygon (triangle7x, triangle7y, 3);
     g2.fill (triangle7);
     
     int[] triangle8x = {170, 160, 180};
     int [] triangle8y = {220,230,230};
     Polygon triangle8 = new Polygon (triangle8x, triangle8y, 3);
     g2.fill (triangle8);
       
     int[] triangle9x = {200, 190, 210};
     int [] triangle9y = {220,230,230};
     Polygon triangle9 = new Polygon (triangle9x, triangle9y, 3);
     g2.fill (triangle9);
       
     //text My Neighbor Totoro
     Rectangle textBox = new Rectangle (70,235,120,20);
     textBox.translate (10,10);
     Color textcolor = new Color (253,174,102);
     g2.setColor(textcolor);
     g2.fill (textBox);
     
     g2.setColor(Color.BLACK);
     g2.drawString ("My Neighbor Totoro :)",85,260);
    }}