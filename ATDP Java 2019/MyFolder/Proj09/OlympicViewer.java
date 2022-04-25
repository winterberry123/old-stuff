
import javax.swing.JFrame;

public class OlympicViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(400, 450);
      frame.setTitle("OlympicLogos");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      OlympicComponent component = new OlympicComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}