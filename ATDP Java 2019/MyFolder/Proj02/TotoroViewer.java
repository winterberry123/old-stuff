
import javax.swing.JFrame;

public class TotoroViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 360);
      frame.setTitle("Totoro");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      TotoroComponent component = new TotoroComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}