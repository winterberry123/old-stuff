
/**
 * Write a description of class Old35 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Old35
{
    public boolean old35(int n) {
      if (n % 3 == 0 && n % 5 == 0) {
        return false;
      }
      else if (n % 3 == 0) {
        return true;
      }
      else if (n % 5 == 0) {
        return true;
      }
      else {
        return false;
      }
    }
}
