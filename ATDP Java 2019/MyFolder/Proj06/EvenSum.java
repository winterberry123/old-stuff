
/**
 * Write a description of class EvenSum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenSum
{
    public class Numbers
{
   /**
      Computes a sum of even integers 
      @param a the lower bound (may be odd or even)
      @param b the upper bound (may be odd or even)
      @return the sum of even integers between a and b (inclusive).
   */
   public int evenSum(int a, int b)
   {
      a = a + 0;
      int sum = 0;
      for (; a <= b; a++){
         if (a % 2 == 0){
            sum = sum + a;
         }
         else {
            sum = sum + 0;
         }
      }
      return sum;
   }
}
}
