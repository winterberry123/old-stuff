
/**
 * Write a description of class Monthly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Monthly extends Appointment
{
    private int day;
    
    public Monthly (String description, int appDay){
        super (description);
        day = appDay;
    }
    
    public boolean occursOn(int year, int month, int day){
        return (this.day == day);
    }
}
