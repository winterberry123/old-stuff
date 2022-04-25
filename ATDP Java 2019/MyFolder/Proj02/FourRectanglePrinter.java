import java.awt.Rectangle;
public class FourRectanglePrinter {
    public static void main(String[] args)
    { 
       Rectangle box = new Rectangle (0,0,10,30);
       System.out.println (box);
       
       Rectangle box2 = box;
       box.translate(10,0);
       System.out.println (box2);
       /* always put a type before the variable, 
           even if the type is class. */
       Rectangle box3 = box;
       box.translate(5,30);
       System.out.println (box3);
       
       Rectangle box4 = box;
       box.translate(-15,0);
       System.out.println (box4);
    }}