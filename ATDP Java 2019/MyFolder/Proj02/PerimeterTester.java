import java.awt.Rectangle;
public class PerimeterTester
{
  public static void main(String[] args)
  {
      Rectangle r1 = new Rectangle (10,20,30,30);
      double perimeter = (r1.getHeight() + r1.getWidth()) * 2;
      System.out.println ("Perimeter:" + perimeter);
      System.out.println ("Expected Answer: 120");
    }}