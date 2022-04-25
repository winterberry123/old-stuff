
/**
 * Write a description of class Daily here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Daily extends Appointment
{
    public Daily (String description) {
        super(description);
    }
    
    public boolean occursOn(int year, int month, int day){
        return true;
    }
}
