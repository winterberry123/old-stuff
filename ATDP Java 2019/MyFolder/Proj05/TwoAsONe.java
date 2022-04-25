
/**
 * Write a description of class TwoAsONe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoAsONe
{
    public boolean twoAsOne(int a, int b, int c) {
      if (a+b==c || a+c==b || b+c ==a){
        return true;
      }
      else {
        return false;
      }
    }

}
