
/**
 * Write a description of class AlarmClock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AlarmClock
{
    public String alarmClock(int day, boolean vacation) {
      if (vacation == false) {
        if (day > 0 && day <= 5) {
          return "7:00";
        }
        else {
          return "10:00";
        }
      }
      else {
        if (day > 0 && day <= 5){
          return "10:00";
        }
        else {
          return "off"; 
          
        }
      }
    }
}
