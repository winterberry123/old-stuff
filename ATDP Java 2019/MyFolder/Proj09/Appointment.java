import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Appointment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Appointment
{
    private String description;
    
    public Appointment(String yourDescription){
        description = yourDescription;   
    }
    
    public void setDescription (String newDescription) {
        description = newDescription;
    }
    
    public abstract boolean occursOn (int year, int month, int day);
    
    public String toString (){
        return description;
    }
    
    
    
}
    