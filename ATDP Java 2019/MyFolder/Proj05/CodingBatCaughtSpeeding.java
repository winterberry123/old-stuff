
/**
 *
 * @author Joyce Chen
 * @version 01
 */
public class CodingBatCaughtSpeeding
{
    public int caughtSpeeding(int speed, boolean isBirthday) {

  
      if ((speed <= 60) && (isBirthday == false)){
        return 0;
      }
      else if ((speed >= 61) && (speed <=80) && (isBirthday == false)) {
        return 1;
      }
      else if ((speed <= 65) && (isBirthday == true)) {
        return 0;
      }
      else if ((speed >= 66) && (speed <= 85) && (isBirthday == true)) {
        return 1;
      }
      else {
        return 2;
      }
    }

}
