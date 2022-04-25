public class Count7
{
   /**
      Counts the number of digits with value 7 in a given number
      @param n any non-negative number
      @return the number of digits with value 7 in the decimal representation of n
   */
   public int countSevens(int n)
   {
      int r = 0;
      for (int i=0; i<=Integer.toString(n).length()+5; i++){
         if (n%10 != 7){
            n = n/10;
         }
         else {
            r++;
            n = n/10;
         }
         
      }
   return r;
   
   
   }
}
    