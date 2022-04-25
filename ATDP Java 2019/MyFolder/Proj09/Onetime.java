
/**
 * Write a description of class Onetime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Onetime extends Appointment
{
    private int year;
    private int month;
    private int day;
    
    public Onetime (String description, int appYear, int appMonth, int appDay) {
        super(description);
        year = appYear;
        month = appMonth;
        day = appDay;
    }
    
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    
    public boolean occursOn(int year, int month, int day){
        return (this.day == day) && (this.month == month) && (this.year == year);
    }
} 
