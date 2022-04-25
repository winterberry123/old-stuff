import java.util.Arrays;
public class Numbers
{
   /**
      Computes the number of even and odd values in a given array
      @param values an array of integer values
      @return an array of length 2 whose 0 entry contains the count
      of even elements and whose 1 entry contains the count of odd
      values
   */
   public int[] evenOdds(int[] values)
   {
      int countEven = 0;
      int countOdd = 0;
      for (int i = 0; i < values.length; i++){
         if (values[i]%2 == 0){
            countEven++;
         }
         else if (values[i]%2 == 1){
            countOdd++;
         }
         
      }
      int [] values1 = {countEven, countOdd};
      return values1;


   }
}