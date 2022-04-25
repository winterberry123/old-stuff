import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Write a description of class ClickListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClickListener implements ActionListener
{
    private int clicked; 
    
    public void actionPerformed(ActionEvent event){
        
        
        System.out.println("I was clicked " + clicked + " time(s)!"); 
        clicked++;
    }
}
