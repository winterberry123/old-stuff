import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

/**
   This component draws stars.
*/
public class ReportComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      
      // The following is for you to place things in the right place
      // Delete these rectangles before you finalize your image
      
      g2.setColor(Color.LIGHT_GRAY);
      g2.draw(new Rectangle(0, 0, 480, 700)); // paper
      g2.draw(new Rectangle(0, 450, 480, 250)); // leave this area blank (for teacher)
      
      
      // Show image at top-right area
      BufferedImage img = null; 
      try {

          img = ImageIO.read(new File("Totoro.png")); // specify file name of the image here
        } 
        catch (IOException e) { 
        }

        int x = 250, y = 0;
        if (img != null && g2.drawImage(img, x, y, null));


      
      // ... HAVE YOUR CODE HERE
      // a of atdp logo
      Rectangle a = new Rectangle (60,70,8,50);
      g2.setColor (Color.BLACK);
      g2.draw (a);
      Ellipse2D.Double a1 = new Ellipse2D.Double (20,70,48,50);
      g2.draw (a1);
      Ellipse2D.Double a2 = new Ellipse2D.Double (28,78,32,34);
      g2.draw (a2);
      
      //t of atdp logo
      Rectangle t = new Rectangle (90,40,8,80);
      g2.draw(t);
      Rectangle t2 = new Rectangle (75,70,37,10);
      g2.draw(t2);
      
      //d of atdp logo
      Rectangle d = new Rectangle (155,40,8,80);
      g2.setColor (Color.BLACK);
      g2.draw (d);
      Ellipse2D.Double d1 = new Ellipse2D.Double (115,70,48,50);
      g2.draw (d1);
      Ellipse2D.Double d2 = new Ellipse2D.Double (123,78,32,34);
      g2.draw (d2);
      
      //p of atdp logo
      Rectangle p = new Rectangle (179,70,8,80);
      g2.setColor (Color.BLACK);
      g2.draw (p);
      Ellipse2D.Double p1 = new Ellipse2D.Double (179,70,48,50);
      g2.draw (p1);
      Ellipse2D.Double p2 = new Ellipse2D.Double (187,78,32,34);
      g2.draw (p2);
      
      //course, grade, etc.
      g2.drawString ("Course: SD 3935.1 - Programming in Java", 20, 280);
      g2.drawString ("Grade report, 7/5/2019", 20, 300);
      g2.drawString ("Student: Joyce Chen", 20, 320);
      double numGrade = 98.86;
      String letGrade = "";
      if (numGrade >= 94){
          letGrade = "A";
        }
      else if (numGrade >= 90){
          letGrade = "A-";
        }
      else if (numGrade >= 87){
          letGrade = "B+";
        }
      else if (numGrade >= 84){
          letGrade = "B";
        }
      else if (numGrade >= 80){
          letGrade = "B-";
        }
      else if (numGrade >= 70){
          letGrade = "PASS";
        }
      else {
          letGrade = "NO PASS";
        }
      g2.drawString ("Grade: " + letGrade, 20, 340);
      
      //parent signature and date
      Rectangle sig = new Rectangle (20, 380, 290, 40);
      g2.draw(sig);
      g2.drawString ("Parent Signature: ", 25,403);
      Rectangle date = new Rectangle (310, 380, 140, 40);
      g2.draw(date);
      g2.drawString ("Date: ", 315, 403);
      
      //teacher comments
      Rectangle comments = new Rectangle (20, 467, 430, 140);
      g2.draw(comments);
      g2.drawString("Comments by teacher: ", 22,460);
      g2.drawString("Joyce has been doing well in all aspects of this course, and learning a great", 22,485);
      g2.drawString("deal. Her work is always thorough and presentable. She pays attention all ", 22,500);
      g2.drawString("throughout the lessons, taking good notes. She also works very well with her", 22,515);
      g2.drawString("partner in class, and is helpful online by answering classmates' questions.", 22,530);
      g2.drawString("All of this is evidenced in her high grade in class. ", 22,545);
   }
}
