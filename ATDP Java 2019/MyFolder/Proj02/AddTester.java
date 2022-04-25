import java.awt.Rectangle;
public class AddTester
{  
   public static void main(String[] args)
   {  
       Rectangle box = new Rectangle (5,10,20,30);
       //adds a point, specified by newx, newy to the bounds of box
       box.add (0,0);
       
       //print information about the box after the add method
       System.out.println ("width:" + box.getWidth()); 
       System.out.println ("height:" + box.getHeight());
       System.out.println ("location:" + box);
       System.out.println ("Expected width: 25");
       System.out.println ("Expected height: 40");
       System.out.println ("Expected location: (0,0,25,40)");
       
       
    }}